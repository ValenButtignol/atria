public class RepOkClass5{
    public boolean property_5() {
        return checkHierarchy(root);
    }

    private boolean checkHierarchy(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
    
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
    
        return checkHierarchy(node.left) && checkHierarchy(node.right);
    }


}
