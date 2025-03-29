public class RepOkClass5{
    public boolean property() {
        return root == null || isBalanced(root);
    }

    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }


}
