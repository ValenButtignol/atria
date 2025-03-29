public class RepOkClass2{
    public boolean property() {
        return root != null && isNonNull(root);
    }

    private boolean isNonNull(AvlNode node) {
        if (node == null) {
            return false;
        }
        return isNonNull(node.left) && isNonNull(node.right);
    }


}
