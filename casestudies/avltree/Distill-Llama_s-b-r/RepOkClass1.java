public class RepOkClass1{
    public boolean repOK_1() {
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
