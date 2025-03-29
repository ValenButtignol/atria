public class RepOkClass4{
    public boolean property() {
        return checkChildrenProperty(root);
    }

    private boolean checkChildrenProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
        return checkChildrenProperty(node.left) && checkChildrenProperty(node.right);
    }


}
