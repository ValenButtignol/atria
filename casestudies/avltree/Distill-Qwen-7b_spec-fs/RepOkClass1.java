public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left == null ? -1 : node.left.height;
        int rightHeight = node.right == null ? -1 : node.right.height;
    
        // Check balance condition
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        // Check left subtree
        if (!checkBalance(node.left)) {
            return false;
        }
    
        // Check right subtree
        if (!checkBalance(node.right)) {
            return false;
        }
    
        // Update current node's height
        node.height = Math.max(leftHeight, rightHeight) + 1;
    
        return true;
    }


}
