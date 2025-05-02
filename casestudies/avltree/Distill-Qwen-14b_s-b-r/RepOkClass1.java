public class RepOkClass1{
    public boolean repOK_1() {
        return checkRep(root);
    }

    private boolean checkRep(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int diff = leftHeight - rightHeight;
    
        // Check balance condition
        if (Math.abs(diff) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Check left child element
        if (node.left != null && node.left.element >= node.element) {
            return false;
        }
    
        // Check right child element
        if (node.right != null && node.right.element <= node.element) {
            return false;
        }
    
        // Check height calculation
        int expectedHeight = Math.max(leftHeight, rightHeight) + 1;
        if (node.height != expectedHeight) {
            return false;
        }
    
        // Recurse on children
        return checkRep(node.left) && checkRep(node.right);
    }


}
