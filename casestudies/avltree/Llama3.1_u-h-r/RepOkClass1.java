public class RepOkClass1{
    public boolean repOK_1() {
        return root == null || repOK_1(root);
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
