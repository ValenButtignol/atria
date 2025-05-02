public class RepOkClass3{
    public boolean property_3() {
        if (root == null) {
            return true;
        }
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        if (node == null) {
            return true;
        }
        if (!(node.color == RED || node.color == BLACK)) {
            return false;
        }
        return checkNode(node.left) && checkNode(node.right);
    }


}
