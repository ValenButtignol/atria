public class RepOkClass2{
    public boolean property_2() {
        return checkBSTProperty(root);
    }

    private boolean checkBSTProperty(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.left != null && compare(node.left.key, node.key) >= 0) {
            return false;
        }
        
        if (node.right != null && compare(node.right.key, node.key) <= 0) {
            return false;
        }
        
        return checkBSTProperty(node.left) && checkBSTProperty(node.right);
    }


}
