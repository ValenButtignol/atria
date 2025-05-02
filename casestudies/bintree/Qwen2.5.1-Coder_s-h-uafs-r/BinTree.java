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
        if (size < 0) {
            return false;
        }
        if (root == null) {
            return size == 0;
        }
        return checkTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkTree(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return checkTree(node.left, min, node.info) && checkTree(node.right, node.info, max);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
