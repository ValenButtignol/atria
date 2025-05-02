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
        return checkForDuplicates(root);
    }

    private boolean checkForDuplicates(Node current) {
        if (current == null) {
            return true;
        }
        if (current.left != null && current.left.info == current.info) {
            return false;
        }
        if (current.right != null && current.right.info == current.info) {
            return false;
        }
        return checkForDuplicates(current.left) && checkForDuplicates(current.right);
    }

    public boolean composedRepOK() {
        if (!property_1())
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

    public boolean property_2() {
        return checkBinaryProperty(root);
    }

    private boolean checkBinaryProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return checkBinaryProperty(node.left) && checkBinaryProperty(node.right);
        }
        return (node.left == null && node.right == null) || (node.left != null && node.right == null) || (node.left == null && node.right != null);
    }

    public boolean property_3() {
        return size == countNodes(root);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public boolean property_4() {
        return size == 0 ? root == null : root != null;
    }

    public boolean property_5() {
        return checkHierarchy(root);
    }

    private boolean checkHierarchy(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
        return checkHierarchy(node.left) && checkHierarchy(node.right);
    }
}
