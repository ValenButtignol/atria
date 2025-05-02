public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        int heightDiff = Math.abs(height(root.left) - height(root.right));
        if (heightDiff > ALLOWED_IMBALANCE) {
            return false;
        }
    
        if (heightDiff == ALLOWED_IMBALANCE) {
            if (height(root.left.left) >= height(root.left.right) && height(root.left.left) >= height(root.right)) {
                return false;
            }
            if (height(root.right.right) >= height(root.right.left) && height(root.right.right) >= height(root.left)) {
                return false;
            }
        }
    
        return repOK_1(root.left) && repOK_1(root.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }


}
