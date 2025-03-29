public class RepOkClass1{
    public boolean property() {
        return checkProperty(root);
    }

    private boolean checkProperty(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = (node.left != null) ? node.left.height : -1;
        int rightHeight = (node.right != null) ? node.right.height : -1;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return checkProperty(node.left) && checkProperty(node.right);
    }


}
