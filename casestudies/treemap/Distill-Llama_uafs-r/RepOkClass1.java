public class RepOkClass1{
    public boolean repOK_1() {
        // Check size consistency
        if (size != countNodes(root)) {
            return false;
        }
    
        // Check root is not null if size > 0
        if (size > 0 && root == null) {
            return false;
        }
    
        // Check root color is black
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        // Check each node's color invariant
        if (!checkColorInvariants(root)) {
            return false;
        }
    
        return true;
    }

    private boolean checkColorInvariants(Node node) {
        if (node == null) {
            return true;
        }
    
        // Check if node is red and parent is not black
        if (node.color == RED && node.parent != null && node.parent.color != BLACK) {
            return false;
        }
    
        // Check if node is black and parent is red (invalid)
        if (node.color == BLACK && node.parent != null && node.parent.color == RED) {
            return false;
        }
    
        // Recurse on left and right children
        return checkColorInvariants(node.left) && checkColorInvariants(node.right);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
