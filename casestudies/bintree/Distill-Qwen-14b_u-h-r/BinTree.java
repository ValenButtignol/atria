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
        if (root == null) {
            return size == 0;
        }
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info > max) {
            return false;
        }
        return checkBST(node.left, min, node.info) && checkBST(node.right, node.info, max);
    }
}
