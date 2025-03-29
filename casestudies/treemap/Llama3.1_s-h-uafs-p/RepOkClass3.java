public class RepOkClass3{
    public boolean property() {
        return isBlack(root);
    }

    private boolean isBlack(Node node) {
        if (node == null) return true;
        if (node.color == RED) return false;
        return isBlack(node.left) && isBlack(node.right);
    }


}
