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
        if (size < 0) {
            return false;
        }
        if (root == null) {
            return size == 0;
        }
        Set<Node> visited = new HashSet<>();
        Queue<Node> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(root);
        int nodeCount = 0;
        while (!nodesToVisit.isEmpty()) {
            Node current = nodesToVisit.remove();
            nodeCount++;
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            if (current.left != null) {
                nodesToVisit.add(current.left);
            }
            if (current.right != null) {
                nodesToVisit.add(current.right);
            }
        }
        return nodeCount == size;
    }
}
