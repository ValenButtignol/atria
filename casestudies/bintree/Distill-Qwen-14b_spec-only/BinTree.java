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
        // Check that the size is correct
        int calculatedSize = calculateSize(root);
        if (calculatedSize != size) {
            return false;
        }
        // Check BST property and no duplicates
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);
        for (int i = 0; i < values.size() - 1; i++) {
            if (values.get(i) >= values.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private int calculateSize(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + calculateSize(node.left) + calculateSize(node.right);
    }

    private void inorderTraversal(Node node, List<Integer> list) {
        if (node != null) {
            inorderTraversal(node.left, list);
            list.add(node.info);
            inorderTraversal(node.right, list);
        }
    }
}
