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
    
        // Check if the current node's height is correctly calculated
        if (node.height != Math.max(leftHeight, rightHeight) + 1) {
            return false;
        }
    
        // Check balance condition
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
