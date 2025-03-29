public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
        return checkNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean checkNode(AvlNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if ((long) node.element <= min || (long) node.element >= max) {
            return false;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        int calculatedHeight = Math.max(leftHeight, rightHeight) + 1;
        if (node.height != calculatedHeight) {
            return false;
        }
        return checkNode(node.left, min, node.element) &&
               checkNode(node.right, node.element, max);
    }


}
