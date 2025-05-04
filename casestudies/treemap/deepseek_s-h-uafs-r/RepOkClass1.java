public class RepOkClass1 {
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        if (!isBST(root, null, null)) {
            return false;
        }
    
        if (!isBalanced(root)) {
            return false;
        }
    
        return true;
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
    
    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }
}
