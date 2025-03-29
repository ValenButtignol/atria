public class RepOkClass1{
    public boolean repOK() {
        return repOK(root);
    }

    private boolean repOK(AvlNode t) {
        if (t == null) {
            return true;
        } else {
            if (!(t instanceof AvlNode)) {
                return false;
            }
            if (t.left != null && t.left != root && !repOK(t.left)) {
                return false;
            }
            if (t.right != null && t.right != root && !repOK(t.right)) {
                return false;
            }
            if (t.height < 0) {
                return false;
            }
            int leftHeight = height(t.left);
            int rightHeight = height(t.right);
            if (leftHeight > t.height - 1 || rightHeight > t.height - 1) {
                return false;
            }
            return true;
        }
    }


}
