public class RepOkClass4{
    public boolean property() {
        return propertyRecursive(root);
    }

    private boolean propertyRecursive(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && node.right != null) {
            return false;
        }
    
        return propertyRecursive(node.left) && propertyRecursive(node.right);
    }


}
