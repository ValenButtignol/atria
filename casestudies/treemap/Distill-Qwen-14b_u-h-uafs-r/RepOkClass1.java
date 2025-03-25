public class RepOkClass1{
    public boolean repOK() {
        // Check that size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check that root is either null or black
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        // Check that all nodes satisfy the BST property
        if (!isBST(root)) {
            return false;
        }
    
        // Check that all nodes satisfy the red-black tree properties
        if (!checkRedBlackProperties(root)) {
            return false;
        }
    
        // Check that the size matches the actual number of nodes
        if (size != countNodes(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        int key = node.key;
        // Check left subtree
        if (node.left != null && compare(node.left.key, key) >= 0) {
            return false;
        }
        // Check right subtree
        if (node.right != null && compare(node.right.key, key) <= 0) {
            return false;
        }
        // Recursively check subtrees
        return isBST(node.left) && isBST(node.right);
    }

    private boolean checkRedBlackProperties(Node node) {
        if (node == null) {
            return true;
        }
        // Check if node is either red or black
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
        // Check parent of red nodes
        if (node.color == RED) {
            if (node.parent == null) { // Red node cannot be root
                return false;
            }
            if (node.parent.color != BLACK) { // Parent of red must be black
                return false;
            }
        }
        // Check black height consistency
        int leftBlackHeight = getBlackHeight(node.left);
        int rightBlackHeight = getBlackHeight(node.right);
        if (leftBlackHeight != rightBlackHeight) {
            return false;
        }
        return checkRedBlackProperties(node.left) && checkRedBlackProperties(node.right);
    }

    private int getBlackHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        Node current = node;
        while (current != null) {
            if (current.color == BLACK) {
                count++;
            }
            current = current.parent;
        }
        return count;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
