public class RepOkClass1 {
    public boolean property() {
        return isBST(root, null, null);
    }
    
    private boolean isBST(Node node, K min, K max) {
        if (node == null) {
            return true;
        }
        if (min != null && compare(node.key, min) <= 0) {
            return false;
        }
        if (max != null && compare(node.key, max) >= 0) {
            return false;
        }
        return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
    }
}
