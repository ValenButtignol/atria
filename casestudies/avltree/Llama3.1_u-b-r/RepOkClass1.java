public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        return repOK(root);
    }

    private boolean repOK(AvlNode t) {
        if (t == null) {
            return true;
        }
    
        if (t.left != null && t.left.element >= t.element) {
            return false;
        }
    
        if (t.right != null && t.right.element <= t.element) {
            return false;
        }
    
        if (Math.abs(height(t.left) - height(t.right)) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return repOK(t.left) && repOK(t.right);
    }


}
