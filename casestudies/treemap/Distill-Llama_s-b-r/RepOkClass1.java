public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
        if (root.color != BLACK) {
            return false;
        }
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        // Check if the node is not the root but has no parent
        if (node.parent == null && node != root) {
            return false;
        }
        // Check if a red node has red children
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
        // Recurse on the left and right children
        if (node.left != null) {
            if (!checkNode(node.left)) {
                return false;
            }
        }
        if (node.right != null) {
            if (!checkNode(node.right)) {
                return false;
            }
        }
        return true;
    }


}
