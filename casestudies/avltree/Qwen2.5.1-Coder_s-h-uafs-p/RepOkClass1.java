public class RepOkClass1{
    public boolean property() {
        return isBalanced(root);
    }

    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int balanceFactor = height(node.left) - height(node.right);
    
        if (Math.abs(balanceFactor) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }


}
