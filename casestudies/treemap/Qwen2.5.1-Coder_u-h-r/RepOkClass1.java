public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
        
        return isBST(root, null, null) && isBalanced(root) && isRedBlackTree(root);
    }

    private boolean isBST(Node node, K min, K max) {
        if (node == null) {
            return true;
        }
        
        if ((min != null && compare(node.key, min) <= 0) || (max != null && compare(node.key, max) >= 0)) {
            return false;
        }
        
        return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private boolean isRedBlackTree(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            return false;
        }
        
        return isRedBlackTree(node.left) && isRedBlackTree(node.right);
    }


}
