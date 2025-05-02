public class RepOkClass1{
    public boolean property_1() {
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = node.left != null ? node.left.height : -1;
        int rightHeight = node.right != null ? node.right.height : -1;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
