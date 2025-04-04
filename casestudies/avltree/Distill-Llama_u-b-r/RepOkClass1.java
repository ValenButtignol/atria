public class RepOkClass1{
    public boolean repOK() {
        return repOK(root);
    }

    private boolean repOK(AvlNode t) {
        if (t == null) {
            return true;
        }
    
        // Check if left and right children are either null or AvlNodes
        if (t.left != null && !(t.left instanceof AvlNode)) {
            return false;
        }
        if (t.right != null && !(t.right instanceof AvlNode)) {
            return false;
        }
    
        // Check if the tree is balanced
        int leftHeight = height(t.left);
        int rightHeight = height(t.right);
        int imbalance = Math.abs(leftHeight - rightHeight);
        if (imbalance > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Recursively check the balance and structure of left and right subtrees
        return repOK(t.left) && repOK(t.right);
    }


}
