public class RepOkClass3 {
    public boolean property_3() {
        return size == countNodes(root);
    }
    
    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
