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
    
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int balance = leftHeight - rightHeight;
    
        // Check balance condition
        if (Math.abs(balance) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        // Check height condition
        int calculatedHeight = Math.max(leftHeight, rightHeight) + 1;
        if (node.height != calculatedHeight) {
            return false;
        }
    
        // Check BST property
        if (node.left != null && node.left.element >= node.element) {
            return false;
        }
        if (node.right != null && node.right.element <= node.element) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkNode(node.left) && checkNode(node.right);
    }


}
