public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        return checkRepOK(root);
    }

    private boolean checkRepOK(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        // Check BST property
        if (node.left != null && node.left.element >= node.element) {
            return false;
        }
        if (node.right != null && node.right.element <= node.element) {
            return false;
        }
    
        // Check AVL balance condition
        int leftHeight = node.left == null ? -1 : node.left.height;
        int rightHeight = node.right == null ? -1 : node.right.height;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        // Check if the node's height is correctly calculated
        int maxHeight = Math.max(leftHeight, rightHeight);
        if (node.height != maxHeight + 1) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkRepOK(node.left) && checkRepOK(node.right);
    }


}
