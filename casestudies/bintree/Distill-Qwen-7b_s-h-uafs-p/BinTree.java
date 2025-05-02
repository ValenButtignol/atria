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

    public boolean property_1() {
        int nodeCount = countNodes(root);
        return nodeCount == size;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public boolean composedRepOK() {
        if (!property_1())
            return false;
        if (!property_2())
            return false;
        if (!property_3())
            return false;
        if (!property_3())
            return false;
        return true;
    }

    public boolean property_2() {
        if (size == 0) {
            return root == null;
        } else {
            return root != null;
        }
    }

    public boolean property_3() {
        return checkLeftChild(root, true);
    }

    private boolean checkLeftChild(Node current, boolean mustHaveLeft) {
        if (current == null) {
            return true;
        }
        if (!mustHaveLeft && current.left == null) {
            return true;
        }
        if (current.left != null) {
            return checkLeftChild(current.left, true);
        }
        return checkLeftChild(current.right, false);
    }
}
