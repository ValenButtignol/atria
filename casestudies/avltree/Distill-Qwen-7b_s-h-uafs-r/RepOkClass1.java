public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        // Check binary search property
        boolean isValid = checkBST(root);
        if (!isValid) {
            return false;
        }
    
        // Check balance condition
        checkBalance(root);
    
        // Check non-negative heights
        checkHeights(root);
    
        return true;
    }

    private boolean checkBST(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && node.left.element >= node.element) {
            return false;
        }
    
        if (node.right != null && node.right.element <= node.element) {
            return false;
        }
    
        boolean leftValid = checkBST(node.left);
        boolean rightValid = checkBST(node.right);
    
        return leftValid && rightValid;
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left == null ? -1 : node.left.height;
        int rightHeight = node.right == null ? -1 : node.right.height;
    
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        boolean leftBalanced = checkBalance(node.left);
        boolean rightBalanced = checkBalance(node.right);
    
        return leftBalanced && rightBalanced;
    }

    private boolean checkHeights(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left == null ? -1 : node.left.height;
        int rightHeight = node.right == null ? -1 : node.right.height;
    
        if (leftHeight < 0 || rightHeight < 0) {
            return false;
        }
    
        return checkHeights(node.left) && checkHeights(node.right);
    }


}
