public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true; // An empty tree satisfies the AVL property
        }
        return isAvl(root) && isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isAvl(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        return isAvl(node.left) && isAvl(node.right);
    }

    private boolean isBst(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return isBst(node.left, min, node.element) && isBst(node.right, node.element, max);
    }


}
