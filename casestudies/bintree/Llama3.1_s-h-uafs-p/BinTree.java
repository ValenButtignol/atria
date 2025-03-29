package casestudies.bintree;

import java.util.*;

public class BinTree {

    private Node root;

    private int size = 0;

    public void add(int x) {
        if (root == null) {
            root = new Node(x);
            size++;
        } else {
            addRecursive(root, x);
        }
    }

    private void addRecursive(Node current, int x) {
        if (x == current.info) {
            return;
        } else if (x < current.info) {
            if (current.left == null) {
                current.left = new Node(x);
                size++;
            } else {
                addRecursive(current.left, x);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(x);
                size++;
            } else {
                addRecursive(current.right, x);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public static class Node {

        private Node left;

        private Node right;

        private int info;

        public Node(int info) {
            this.info = info;
        }
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
        return true;
    }

    public boolean property() {
        return size >= 0;
    }

    public boolean property_2() {
        return isCyclic(root) == null;
    }

    private Node isCyclic(Node node) {
        if (node == null) {
            return null;
        }
        Node leftCycle = isCyclic(node.left);
        Node rightCycle = isCyclic(node.right);
        if (leftCycle != null) {
            return leftCycle;
        }
        if (rightCycle != null) {
            return rightCycle;
        }
        if (node.left == node || node.right == node) {
            return node;
        }
        return null;
    }

    public boolean property_3() {
        return size == countNodes(root);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }

    public boolean property_4() {
        return size == countNodes(root);
    }

    private int countNodes_2(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
}
