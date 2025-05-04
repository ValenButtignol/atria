public class RepOkClass1 {
    public boolean repOK_1() {
        return isBalanced(root) && isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) && heightConsistent(root);
    }
    
    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
        int balance = height(node.left) - height(node.right);
        if (Math.abs(balance) > ALLOWED_IMBALANCE) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }
    
    private boolean isBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return isBST(node.left, min, node.element) && isBST(node.right, node.element, max);
    }
    
    private boolean heightConsistent(AvlNode node) {
        if (node == null) {
            return true;
        }
        if (node.height != Math.max(height(node.left), height(node.right)) + 1) {
            return false;
        }
        return heightConsistent(node.left) && heightConsistent(node.right);
    }
}
