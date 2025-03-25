public class RepOkClass1{
    public boolean repOK() {
        // Check if root is null, size must be zero and vice versa
        if (root == null) {
            return size == 0;
        } else {
            // Check that size is equal to the number of nodes
            int nodeCount = countNodes(root);
            if (size != nodeCount) {
                return false;
            }
            // Check that the tree is a valid BST
            return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        // Check if current node's value is within the allowed range
        if (node.info <= min || node.info > max) {
            return false;
        }
        // Recursively check left and right subtrees
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }


}
