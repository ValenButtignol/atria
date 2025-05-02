public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
    
        if (!isRedBlackTree(root)) {
            return false;
        }
    
        if (!isBST(root, null, null)) {
            return false;
        }
    
        if (size != countNodes(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isRedBlackTree(Node node) {
        if (node == null) {
            return true;
        }
    
        if (isRed(node) && isRed(node.left) || isRed(node) && isRed(node.right)) {
            return false;
        }
    
        int blackHeight = getBlackHeight(node);
        if (blackHeight == -1) {
            return false;
        }
    
        return isRedBlackTree(node.left) && isRedBlackTree(node.right);
    }

    private boolean isBST(Node node, K min, K max) {
        if (node == null) {
            return true;
        }
    
        if (min != null && node.key.compareTo(min) <= 0) {
            return false;
        }
    
        if (max != null && node.key.compareTo(max) >= 0) {
            return false;
        }
    
        return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
    }

    private boolean isRed(Node node) {
        return node != null && node.color == Color.RED;
    }

    private int getBlackHeight(Node node) {
        if (node == null) {
            return 1;
        }
    
        int leftHeight = getBlackHeight(node.left);
        int rightHeight = getBlackHeight(node.right);
    
        if (leftHeight == -1 || rightHeight == -1 || leftHeight != rightHeight) {
            return -1;
        }
    
        return isRed(node) ? leftHeight : leftHeight + 1;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private enum Color {
        RED, BLACK
    }

    private static class Node {
        K key;
        V value;
        Node left;
        Node right;
        Node parent;
        Color color;
    
        Node(K key, V value, Node parent, Color color) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.color = color;
        }
    }


}
