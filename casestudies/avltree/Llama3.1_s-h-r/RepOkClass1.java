public class RepOkClass1{
    public boolean repOK_1() {
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
    
        return repOK_1(root.left) && repOK_1(root.right);
    }

    private boolean repOK_1(AvlNode t) {
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
    
        return repOK_1(t.left) && repOK_1(t.right);
    }


}
