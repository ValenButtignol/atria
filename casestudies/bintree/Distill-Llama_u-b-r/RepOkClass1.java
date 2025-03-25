public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != countNodes()) {
            return false;
        }
    
        // Check the structure of the tree
        return checkStructure(root);
    }

    private int countNodes() {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private boolean checkStructure(Node node) {
        if (node == null) {
            return true;
        }
        // Check left child
        if (node.left != null && node.left.info >= node.info) {
            return false;
        }
        // Check right child
        if (node.right != null && node.right.info <= node.info) {
            return false;
        }
        // Recursively check left and right subtrees
        return checkStructure(node.left) && checkStructure(node.right);
    }


}
