public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true; // empty tree is valid
        }
    
        // check that the tree is a valid binary search tree
        return repOK(root);
    
    }

    private boolean repOK(AvlNode t) {
        if (t == null) {
            return true; // empty tree is valid
        }
    
        // check that the tree is a valid binary search tree
        if (t.left != null && t.element <= t.left.element) {
            return false;
        }
        if (t.right != null && t.element >= t.right.element) {
            return false;
        }
    
        // check that the tree is balanced
        return Math.abs(height(t.left) - height(t.right)) <= ALLOWED_IMBALANCE
                && repOK(t.left) && repOK(t.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }


}
