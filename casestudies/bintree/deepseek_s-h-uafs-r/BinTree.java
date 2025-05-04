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
        if (root == null) {
            return size == 0;
        }
        Set<Node> visited = new HashSet<>();
        int[] count = { 0 };
        boolean isValid = checkBST(root, visited, count, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return isValid && count[0] == size;
    }

    private boolean checkBST(Node node, Set<Node> visited, int[] count, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info < min || node.info > max || !visited.add(node)) {
            return false;
        }
        count[0]++;
        return checkBST(node.left, visited, count, min, node.info - 1) && checkBST(node.right, visited, count, node.info + 1, max);
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
