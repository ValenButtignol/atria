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
        return checkNodes(root);
    }

    private boolean checkNodes(Node current) {
        if (current == null) {
            return true;
        }
        // Check left child
        if (current.left != null) {
            if (current.left.info >= current.info) {
                return false;
            }
        }
        // Check right child
        if (current.right != null) {
            if (current.right.info <= current.info) {
                return false;
            }
        }
        // Recurse on children
        return checkNodes(current.left) && checkNodes(current.right);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
