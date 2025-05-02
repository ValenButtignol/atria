public class RepOkClass3{
    public boolean property_3() {
        return isBST(root);
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        // Check left child
        if (node.left != null) {
            if (node.left.key >= node.key) {
                return false;
            }
            if (!isBST(node.left)) {
                return false;
            }
        }
        // Check right child
        if (node.right != null) {
            if (node.right.key <= node.key) {
                return false;
            }
            if (!isBST(node.right)) {
                return false;
            }
        }
        return true;
    }


}
