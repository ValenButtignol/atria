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
        if (!property_3())
            return false;
        if (!property_4())
            return false;
        if (!property_5())
            return false;
        return true;
    }

    public boolean property() {
        if (root != null) {
            // Check root's parent is null
            if (root.parent != null) {
                return false;
            }
            // Use a queue for BFS traversal
            java.util.Queue<Node> queue = new java.util.LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                // Check parent for non-root nodes
                if (node != root && node.parent == null) {
                    return false;
                }
                // Check left child's parent
                if (node.left != null && node.left.parent != node) {
                    return false;
                }
                // Check right child's parent
                if (node.right != null && node.right.parent != node) {
                    return false;
                }
                // Add children to queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return true;
    }

    public boolean property_2() {
        if (root == null) {
            return true;
        }
        if (root.color != BLACK) {
            return false;
        }
        return checkNodes(root, false);
    }

    private boolean checkNodes(Node node, boolean parentIsRed) {
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
        if (parentIsRed && node.color == RED) {
            return false;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color != BLACK) {
                return false;
            }
            if (node.right != null && node.right.color != BLACK) {
                return false;
            }
        }
        boolean leftOk = (node.left == null) || checkNodes(node.left, node.color == RED);
        boolean rightOk = (node.right == null) || checkNodes(node.right, node.color == RED);
        return leftOk && rightOk;
    }

    public boolean property_3() {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            // Check root's parent is null
            if (current == root && current.parent != null) {
                return false;
            }
            // Check non-root nodes have a valid parent
            if (current != root && current.parent == null) {
                return false;
            }
            // Check parent's left or right points back to current
            if (current != root) {
                Node parent = current.parent;
                if (parent.left != current && parent.right != current) {
                    return false;
                }
            }
            // Check children's parent references
            if (current.left != null) {
                if (current.left.parent != current) {
                    return false;
                }
                queue.add(current.left);
            }
            if (current.right != null) {
                if (current.right.parent != current) {
                    return false;
                }
                queue.add(current.right);
            }
        }
        return true;
    }

    public boolean property_4() {
        return checkBSTProperty(root);
    }

    private boolean checkBSTProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && compare(node.left.key, node.key) >= 0) {
            return false;
        }
        if (node.right != null && compare(node.right.key, node.key) <= 0) {
            return false;
        }
        return checkBSTProperty(node.left) && checkBSTProperty(node.right);
    }

    public boolean property_5() {
        int count = 0;
        Node current = root;
        if (current == null) {
            return size == 0;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(current);
        while (!stack.isEmpty()) {
            current = stack.pop();
            count++;
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return count == size;
    }
}
