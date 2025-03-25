public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        }
        return isValidNode(root) && size == countNodes(root);
    }

    private boolean isValidNode(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
        return isValidNode(node.left) && isValidNode(node.right);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
