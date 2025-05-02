public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        return isBalanced(root) && isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) && isConsistentHeight(root);
    }

    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private boolean isBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.element <= min || node.element >= max) {
            return false;
        }
    
        return isBST(node.left, min, node.element) && isBST(node.right, node.element, max);
    }

    private boolean isConsistentHeight(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.height != Math.max(height(node.left), height(node.right)) + 1) {
            return false;
        }
    
        return isConsistentHeight(node.left) && isConsistentHeight(node.right);
    }

    private int height(AvlNode node) {
        return node == null ? -1 : node.height;
    }


}
