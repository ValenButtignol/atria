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
        if (size == 0 && root != null) {
            return false;
        }
        if (size > 0 && root == null) {
            return false;
        }
        int actualSize = countNodes(root);
        return actualSize == size;
    }

    private int countNodes(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + countNodes(current.left) + countNodes(current.right);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
