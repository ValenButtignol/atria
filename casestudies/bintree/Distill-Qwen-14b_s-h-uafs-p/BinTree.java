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
        if (!property())
            return false;
        return true;
    }

    public boolean property() {
        if (root == null) {
            return true;
        }
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                if (visited.contains(current.left)) {
                    return false;
                }
                visited.add(current.left);
                queue.add(current.left);
            }
            if (current.right != null) {
                if (visited.contains(current.right)) {
                    return false;
                }
                visited.add(current.right);
                queue.add(current.right);
            }
        }
        return true;
    }
}
