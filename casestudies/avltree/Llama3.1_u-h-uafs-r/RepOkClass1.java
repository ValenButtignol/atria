public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        int heightDiff = height(root.left) - height(root.right);
        if (Math.abs(heightDiff) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        if (heightDiff > 0) {
            if (height(root.left.left) >= height(root.left.right)) {
                return false;
            }
        } else {
            if (height(root.right.right) >= height(root.right.left)) {
                return false;
            }
        }
    
        return repOK(root.left) && repOK(root.right);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }


}
