public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left != null ? node.left.height : -1;
        int rightHeight = node.right != null ? node.right.height : -1;
    
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
