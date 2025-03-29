public class RepOkClass4{
    public boolean property() {
        if (isEmpty()) {
            return true;
        }
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBST(AvlNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return isBST(node.left, min, node.element) && isBST(node.right, node.element, max);
    }


}
