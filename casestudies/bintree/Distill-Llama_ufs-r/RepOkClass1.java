public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
        if (size == 0) {
            return root == null;
        }
        if (root == null) {
            return false;
        }
        return checkBST(root);
    }

    private boolean checkBST(Node node) {
        if (node.left != null) {
            if (node.left.info >= node.info) {
                return false;
            }
        }
        if (node.right != null) {
            if (node.right.info <= node.info) {
                return false;
            }
        }
        if (node.left != null || node.right != null) {
            return checkBST(node.left) && checkBST(node.right);
        }
        return true;
    }


}
