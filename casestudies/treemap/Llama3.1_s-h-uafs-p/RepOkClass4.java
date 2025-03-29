public class RepOkClass4{
    public boolean property() {
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        if (node == null) return true;
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) return false;
            if (node.right != null && node.right.color == RED) return false;
        }
        return checkNode(node.left) && checkNode(node.right);
    }


}
