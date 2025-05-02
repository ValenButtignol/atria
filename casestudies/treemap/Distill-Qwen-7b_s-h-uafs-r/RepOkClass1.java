public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        // Check root color
        if (!isRootBlack()) {
            return false;
        }
    
        // Check all nodes
        Node current = root;
        while (current != null) {
            if (!isNodeValid(current)) {
                return false;
            }
            current = current.right;
        }
    
        return true;
    }

    private boolean isRootBlack() {
        return root.color == BLACK;
    }

    private boolean isNodeValid(Node node) {
        if (node == null) {
            return true;
        }
    
        // Check left and right children colors
        if (node.left != null) {
            if (node.left.color == RED && node.color != BLACK) {
                return false;
            }
        }
    
        if (node.right != null) {
            if (node.right.color == RED && node.color != BLACK) {
                return false;
            }
        }
    
        // Check key order
        if (node.left != null) {
            if (!compare(node.left.key, node.key)) {
                return false;
            }
        }
    
        if (node.right != null) {
            if (!compare(node.right.key, node.key)) {
                return false;
            }
        }
    
        return true;
    }


}
