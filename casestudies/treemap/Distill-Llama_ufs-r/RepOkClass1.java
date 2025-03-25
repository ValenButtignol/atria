public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is consistent
        if (size != countNodes()) {
            return false;
        }
    
        // Check if the root is black and not null when the tree is non-empty
        if (root == null) {
            return size == 0;
        }
        if (root.color != BLACK) {
            return false;
        }
    
        // Post-order traversal to check node structure
        return postOrderCheck(root);
    }

    private int countNodes() {
        int count = 0;
        Node current = root;
        while (current != null) {
            count++;
            current = current.left;
        }
        return count;
    }

    private boolean postOrderCheck(Node node) {
        if (node == null) {
            return true;
        }
    
        // Check left subtree
        boolean leftOK = postOrderCheck(node.left);
    
        // Check right subtree
        boolean rightOK = postOrderCheck(node.right);
    
        // Check current node's structure based on color
        if (node.color == RED) {
            // Red node must have both left and right children
            if (node.left == null || node.right == null) {
                return false;
            }
        } else {
            // Black node can have at most one child
            int childrenCount = 0;
            if (node.left != null) childrenCount++;
            if (node.right != null) childrenCount++;
            if (childrenCount > 1) {
                return false;
            }
        }
    
        return true;
    }


}
