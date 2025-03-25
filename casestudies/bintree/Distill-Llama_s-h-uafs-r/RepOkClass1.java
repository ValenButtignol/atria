public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != countNodes(root)) {
            return false;
        }
    
        // Check each node's children and order
        return traverseTree(root) != -1;
    }

    private static int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private static int traverseTree(Node node) {
        if (node == null) {
            return -1;
        }
    
        // Check left and right children
        if (node.left != null && node.right != null) {
            // Check left child
            if (traverseTree(node.left) == -1) {
                return -1;
            }
            // Check right child
            if (traverseTree(node.right) == -1) {
                return -1;
            }
        } else if (node.left != null || node.right != null) {
            // If only one child exists, check it
            if (traverseTree(node.left) == -1) {
                return -1;
            }
            if (traverseTree(node.right) != -1) {
                return -1;
            }
        } else {
            // No children, proceed
            return 0;
        }
    
        // Check node's value against children
        if (node.left != null && node.left.info >= node.info) {
            return -1;
        }
        if (node.right != null && node.right.info <= node.info) {
            return -1;
        }
    
        // Recurse on children
        return 1 + traverseTree(node.left) + traverseTree(node.right);
    }


}
