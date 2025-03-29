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
        return true;
    }

    public boolean property() {
        return isBST(root);
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        boolean leftCheck = isBST(node.left);
        if (!leftCheck) {
            return false;
        }
        boolean rightCheck = isBST(node.right);
        if (!rightCheck) {
            return false;
        }
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
        return true;
    }
}
