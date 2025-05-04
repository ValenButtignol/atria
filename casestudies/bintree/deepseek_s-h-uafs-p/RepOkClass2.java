public class RepOkClass2 {
    public boolean property_2() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }
}
