public class RepOkClass1{
    public boolean repOK_1() {
        if (isEmpty()) {
            return root == null;
        }
    
        AvlNode current = root;
        while (current != null) {
            // Check Binary Search Tree property
            if (!isBST(current)) {
                return false;
            }
    
            // Check Balance property
            if (!isBalanced(current)) {
                return false;
            }
    
            // Check Height consistency
            if (!isHeightConsistent(current)) {
                return false;
            }
    
            current = current.right;
        }
    
        return true;
    }

    private boolean isBST(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        if ((node.left != null && node.left.element >= node.element) ||
            (node.right != null && node.right.element <= node.element)) {
            return false;
        }
    
        return isBST(node.left) && isBST(node.right);
    }

    private boolean isBalanced(AvlNode node) {
        int leftHeight = node.left == null ? -1 : node.left.height;
        int rightHeight = node.right == null ? -1 : node.right.height;
    
        return Math.abs(leftHeight - rightHeight) <= ALLOWED_IMBALANCE;
    }

    private boolean isHeightConsistent(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int expectedHeight = Math.max(height(node.left), height(node.right)) + 1;
    
        return node.height == expectedHeight;
    }


}
