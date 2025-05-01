public class RepOkClass3 {
    public boolean property() {
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBst(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return isBst(node.left, min, node.element) && isBst(node.right, node.element, max);
    }
}
