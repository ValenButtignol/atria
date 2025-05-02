public class RepOkClass3{
    public boolean property_3() {
        return isLeafPropertySatisfied(root);
    }

    private boolean isLeafPropertySatisfied(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return node.color == BLACK;
        }
        return isLeafPropertySatisfied(node.left) && isLeafPropertySatisfied(node.right);
    }


}
