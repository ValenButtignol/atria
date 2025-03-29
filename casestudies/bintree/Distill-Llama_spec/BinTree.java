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
        if (!repOK_2())
            return false;
        return true;
    }

    public boolean repOK_2() {
        // Check if the tree is a BST
        if (!isBST(root, null, null)) {
            return false;
        }
        // Count the number of nodes
        int count = countNodes(root);
        // Check if the size matches the count
        return count == size;
    }

    private static boolean isBST(Node node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (min != null && node.info <= min) {
            return false;
        }
        if (max != null && node.info >= max) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    private static int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
