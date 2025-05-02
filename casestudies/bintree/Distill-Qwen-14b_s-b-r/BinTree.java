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

    public boolean repOK_1() {
        // Check if root is null, size must be zero and vice versa
        if (root == null) {
            return size == 0;
        } else {
            // Check that size is equal to the number of nodes
            int nodeCount = countNodes(root);
            if (size != nodeCount) {
                return false;
            }
            // Check that the tree is a valid BST
            return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        // Check if current node's value is within the allowed range
        if (node.info <= min || node.info > max) {
            return false;
        }
        // Recursively check left and right subtrees
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
