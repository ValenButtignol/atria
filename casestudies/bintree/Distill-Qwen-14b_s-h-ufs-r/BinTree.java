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
        if (size == 0) {
            return root == null;
        }
        if (root == null) {
            return false;
        }
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        int nodeCount = 0;
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current == null) {
                continue;
            }
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            nodeCount++;
            if (current.left != null) {
                if (current.left.info >= current.info) {
                    return false;
                }
                stack.push(current.left);
            }
            if (current.right != null) {
                if (current.right.info <= current.info) {
                    return false;
                }
                stack.push(current.right);
            }
        }
        return nodeCount == size;
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
