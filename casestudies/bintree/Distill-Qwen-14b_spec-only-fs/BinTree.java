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
        // Check size consistency
        if (size < 0) {
            return false;
        }
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
        // Check uniqueness of values
        Set<Integer> values = new HashSet<>();
        collectValues(root, values);
        if (values.size() != size) {
            return false;
        }
        // Verify BST property
        if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
        // Check for acyclic structure
        if (!isAcyclic(root, new HashSet<>())) {
            return false;
        }
        return true;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private void collectValues(Node node, Set<Integer> values) {
        if (node == null) {
            return;
        }
        values.add(node.info);
        collectValues(node.left, values);
        collectValues(node.right, values);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info > max) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    private boolean isAcyclic(Node node, Set<Node> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return isAcyclic(node.left, visited) && isAcyclic(node.right, visited);
    }
}
