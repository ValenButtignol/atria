public class RepOkClass1{
    public boolean repOK_1() {
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
