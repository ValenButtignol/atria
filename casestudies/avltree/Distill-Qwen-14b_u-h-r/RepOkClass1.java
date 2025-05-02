public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
        return checkNode(root);
    }

    private boolean checkNode(AvlNode node) {
        if (node == null) {
            return true;
        }
        
        // Check height validity
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
        
        // Check if height is correctly calculated
        int calculatedHeight = Math.max(leftHeight, rightHeight) + 1;
        if (node.height != calculatedHeight) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return checkNode(node.left) && checkNode(node.right);
    }


}
