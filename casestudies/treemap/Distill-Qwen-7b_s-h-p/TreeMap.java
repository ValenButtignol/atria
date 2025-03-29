package casestudies.treemap;

import java.util.*;

public class TreeMap<K, V> {

    private static final boolean RED = true;

    private static final boolean BLACK = false;

    private class Node {

        K key;

        V value;

        Node left, right, parent;

        boolean color;

        Node(K key, V value, boolean color, Node parent) {
            this.key = key;
            this.value = value;
            this.color = color;
            this.parent = parent;
        }
    }

    private Node root;

    private final Comparator<? super K> comparator;

    private int size = 0;

    public TreeMap() {
        this.comparator = null;
    }

    public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }

    @SuppressWarnings("unchecked")
    private int compare(K k1, K k2) {
        if (comparator != null) {
            return comparator.compare(k1, k2);
        } else {
            return ((Comparable<? super K>) k1).compareTo(k2);
        }
    }

    public V put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        if (root == null) {
            root = new Node(key, value, BLACK, null);
            size++;
            return null;
        }
        Node parent = null;
        Node current = root;
        int cmp;
        while (current != null) {
            cmp = compare(key, current.key);
            parent = current;
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
        }
        Node newNode = new Node(key, value, RED, parent);
        if (compare(key, parent.key) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        fixInsertion(newNode);
        size++;
        return null;
    }

    private void fixInsertion(Node node) {
        while (node.parent != null && node.parent.color == RED) {
            Node grandparent = node.parent.parent;
            if (grandparent == null)
                break;
            if (node.parent == grandparent.left) {
                Node uncle = grandparent.right;
                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        rotateLeft(node);
                    }
                    node.parent.color = BLACK;
                    grandparent.color = RED;
                    rotateRight(grandparent);
                }
            } else {
                Node uncle = grandparent.left;
                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rotateRight(node);
                    }
                    node.parent.color = BLACK;
                    grandparent.color = RED;
                    rotateLeft(grandparent);
                }
            }
        }
        root.color = BLACK;
    }

    private void rotateLeft(Node node) {
        Node rightChild = node.right;
        if (rightChild == null)
            return;
        node.right = rightChild.left;
        if (rightChild.left != null) {
            rightChild.left.parent = node;
        }
        rightChild.parent = node.parent;
        if (node.parent == null) {
            root = rightChild;
        } else if (node == node.parent.left) {
            node.parent.left = rightChild;
        } else {
            node.parent.right = rightChild;
        }
        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rotateRight(Node node) {
        Node leftChild = node.left;
        if (leftChild == null)
            return;
        node.left = leftChild.right;
        if (leftChild.right != null) {
            leftChild.right.parent = node;
        }
        leftChild.parent = node.parent;
        if (node.parent == null) {
            root = leftChild;
        } else if (node == node.parent.right) {
            node.parent.right = leftChild;
        } else {
            node.parent.left = leftChild;
        }
        leftChild.right = node;
        node.parent = leftChild;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public boolean repOK() {
        if (!property())
            return false;
        if (!property_2())
            return false;
        return true;
    }

    public boolean property() {
        return size == this.size();
    }

    public boolean property_2() {
        if (root == null) {
            return true;
        }
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        if (node == null) {
            return true;
        }
        if (!(node.color == RED || node.color == BLACK)) {
            return false;
        }
        return checkNode(node.left) && checkNode(node.right);
    }
}
