public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
        if (root == null) {
            return size == 0;
        }
        return checkNodes(root);
    }

    private boolean checkNodes(Node current) {
        if (current == null) {
            return true;
        }
        // Check left child
        if (current.left != null) {
            if (current.left.info >= current.info) {
                return false;
            }
        }
        // Check right child
        if (current.right != null) {
            if (current.right.info <= current.info) {
                return false;
            }
        }
        // Recurse on children
        return checkNodes(current.left) && checkNodes(current.right);
    }


}
