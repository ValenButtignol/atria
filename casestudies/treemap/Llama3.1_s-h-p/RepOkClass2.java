public class RepOkClass2{
    public boolean property_2() {
        if (root == null) return true;
    
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        if (node == null) return true;
    
        if (node.key == null || node.value == null) return false;
    
        return checkNode(node.left) && checkNode(node.right);
    }


}
