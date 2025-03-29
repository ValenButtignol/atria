public class RepOkClass1{
    public boolean property() {
        return isRedBlackTree(root);
    }

    private boolean isRedBlackTree(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            return false;
        }
        return isRedBlackTree(node.left) && isRedBlackTree(node.right);
    }


}
