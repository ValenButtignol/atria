public class RepOkClass1 {
    
    public boolean property() {
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
        
        int heightDiff = height(node.left) - height(node.right);
        if (Math.abs(heightDiff) > ALLOWED_IMBALANCE) {
            return false;
        }
        
        return checkBalance(node.left) && checkBalance(node.right);
    }
}
