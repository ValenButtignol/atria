public class RepOkClass3{
    public boolean property() {
        return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBst(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element > max) {
            return false;
        }
        return checkBst(node.left, min, node.element) && checkBst(node.right, node.element, max);
    }


}
