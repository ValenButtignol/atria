public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        if (root.left != null && root.right != null) {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
                return false;
            }
        }
    
        return repOK(root.left) && repOK(root.right);
    }

    private boolean repOK(AvlNode t) {
        if (t == null) {
            return true;
        }
    
        if (t.left != null && t.right != null) {
            int leftHeight = height(t.left);
            int rightHeight = height(t.right);
            if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
                return false;
            }
        }
    
        return repOK(t.left) && repOK(t.right);
    }


}
