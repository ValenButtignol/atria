public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        return checkInvariant(root);
    }

    private boolean checkInvariant(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
    
        // Check height balance condition
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Check if the node's height is correctly calculated
        int maxHeight = Math.max(leftHeight, rightHeight);
        if (node.height != maxHeight + 1) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkInvariant(node.left) && checkInvariant(node.right);
    }

    private int height(AvlNode node) {
        return node == null ? -1 : node.height;
    }


}
