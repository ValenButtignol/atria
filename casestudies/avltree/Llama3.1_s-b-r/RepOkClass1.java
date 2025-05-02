public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true; // empty tree is valid
        }
    
        // check that the tree is a valid binary search tree
        return repOK_1(root);
    
    }

    private boolean repOK_1(AvlNode t) {
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
                && repOK_1(t.left) && repOK_1(t.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }


}
