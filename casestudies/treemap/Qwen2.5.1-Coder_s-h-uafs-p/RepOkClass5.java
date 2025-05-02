public class RepOkClass5{
    public boolean property_5() {
        return checkDepthProperty(root);
    }

    private boolean checkDepthProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == BLACK) {
            return checkDepthProperty(node.left) && checkDepthProperty(node.right);
        }
        return checkDepthProperty(node.left) && checkDepthProperty(node.right);
    }


}
