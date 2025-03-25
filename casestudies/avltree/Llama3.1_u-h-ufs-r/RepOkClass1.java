public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        int heightDiff = Math.abs(height(root.left) - height(root.right));
        if (heightDiff > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return repOK(root.left) && repOK(root.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
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
    
        return repOK(t.left) && repOK(t.right);
    }


}
