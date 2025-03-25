public class RepOkClass1{
    public boolean repOK() {
        // Check if the root is null, and if so, the size is 0
        if (root == null && size != 0) {
            return false;
        }
        
        // Check if the root is not null, and if so, the size is greater than 0
        if (root != null && size == 0) {
            return false;
        }
        
        // Check if the size is correct based on the number of nodes in the tree
        if (size != countNodes(root)) {
            return false;
        }
        
        // Check if the tree is a valid binary tree (i.e., each node has at most two children)
        return isValidBinaryTree(root);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }

    private boolean isValidBinaryTree(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.left != null && node.right != null) {
            return false;
        }
        
        return isValidBinaryTree(node.left) && isValidBinaryTree(node.right);
    }


}
