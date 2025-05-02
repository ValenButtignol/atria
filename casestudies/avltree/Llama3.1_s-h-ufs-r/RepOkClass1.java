public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        int heightDiff = Math.abs(height(root.left) - height(root.right));
        if (heightDiff > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return repOK_1(root.left) && repOK_1(root.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    private boolean repOK_1(AvlNode t) {
        if (t == null) {
            return true;
        }
    
        if (t.left != null && t.left.element >= t.element) {
            return false;
        }
    
        if (t.right != null && t.right.element <= t.element) {
            return false;
        }
    
        return repOK_1(t.left) && repOK_1(t.right);
    }


}
