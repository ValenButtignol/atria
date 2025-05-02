public class RepOkClass3{
    public boolean property_3() {
        return isUnique(root);
    }

    private boolean isUnique(AvlNode node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.element == node.left.element) {
            return false;
        }
        if (node.right != null && node.element == node.right.element) {
            return false;
        }
        return isUnique(node.left) && isUnique(node.right);
    }


}
