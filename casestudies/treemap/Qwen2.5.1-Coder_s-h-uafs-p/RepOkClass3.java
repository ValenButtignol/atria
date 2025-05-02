public class RepOkClass3{
    public boolean property_3() {
        return checkNilProperty(root);
    }

    private boolean checkNilProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED) {
            return false;
        }
        return checkNilProperty(node.left) && checkNilProperty(node.right);
    }


}
