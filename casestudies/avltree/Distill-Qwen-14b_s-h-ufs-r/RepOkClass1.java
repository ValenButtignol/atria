public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        // Check if the tree is a valid BST
        if (!checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check if all nodes have correct heights and balance
        return checkHeightsAndBalance(root);
    }

    private boolean checkBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return checkBST(node.left, min, node.element) && checkBST(node.right, node.element, max);
    }

    private boolean checkHeightsAndBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left != null ? node.left.height : 0;
        int rightHeight = node.right != null ? node.right.height : 0;
    
        // Check if the balance condition is satisfied
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        // Check if the current node's height is correctly computed
        int currentHeight = 1 + Math.max(leftHeight, rightHeight);
        if (node.height != currentHeight) {
            return false;
        }
    
        // Recursively check left and right subtrees
        return checkHeightsAndBalance(node.left) && checkHeightsAndBalance(node.right);
    }


}
