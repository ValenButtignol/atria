public class RepOkClass5{
    public boolean property_5() {
        if (isEmpty()) return true;
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) return true;
        int leftHeight = node.left != null ? height(node.left) : -1;
        int rightHeight = node.right != null ? height(node.right) : -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return false;
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
