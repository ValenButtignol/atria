public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the root is null or satisfies the BST property
        if (root != null && !isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check if the size matches the actual number of nodes in the tree
        return size == countNodes(root);
    }

    private boolean isBST(Node node, int min, int max) {
        // Base case: an empty tree is a BST
        if (node == null) {
            return true;
        }
    
        // Check if the current node's value is within the valid range
        if (node.info <= min || node.info >= max) {
            return false;
        }
    
        // Recursively check the left and right subtrees
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
