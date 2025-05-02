public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
        return isBST(root) && checkBalanceAndHeight(root);
    }

    private boolean isBST(AvlNode node) {
        return isBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTHelper(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element < min || node.element > max) {
            return false;
        }
        return isBSTHelper(node.left, min, node.element) && isBSTHelper(node.right, node.element, max);
    }

    private boolean checkBalanceAndHeight(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = node.left != null ? node.left.height : 0;
        int rightHeight = node.right != null ? node.right.height : 0;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        int maxHeight = Math.max(leftHeight, rightHeight);
        if (node.height != maxHeight + 1) {
            return false;
        }
        return checkBalanceAndHeight(node.left) && checkBalanceAndHeight(node.right);
    }


}
