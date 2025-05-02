public class RepOkClass1{
    public boolean repOK_1() {
        return checkHeight(root) && !hasDuplicates(root, null, null);
    }

    private boolean checkHeight(AvlNode t) {
        if (t == null) {
            return true;
        }
        int leftHeight = height(t.left);
        int rightHeight = height(t.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        return checkHeight(t.left) && checkHeight(t.right);
    }

    private boolean hasDuplicates(AvlNode t, Integer min, Integer max) {
        if (t == null) {
            return false;
        }
        if (min != null && t.element <= min) {
            return true;
        }
        if (max != null && t.element >= max) {
            return true;
        }
        return hasDuplicates(t.left, min, t.element) || hasDuplicates(t.right, t.element, max);
    }


}
