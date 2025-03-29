public class RepOkClass3{
    public boolean property() {
        return checkNodeChildren(root);
    }

    private boolean checkNodeChildren(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return false;
        }
        return checkNodeChildren(node.left) && checkNodeChildren(node.right);
    }


}
