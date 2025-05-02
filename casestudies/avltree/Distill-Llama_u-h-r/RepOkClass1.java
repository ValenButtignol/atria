public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return false;
        }
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        // Check if the node has either left or right child, or both
        if (node.left == null && node.right == null) {
            return false;
        }
    
        // Check balance condition
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int diff = leftHeight - rightHeight;
    
        if (Math.abs(diff) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
