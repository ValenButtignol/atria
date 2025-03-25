public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
        
        // Check root color
        if (!isBlack(root)) {
            return false;
        }
        
        // Check all nodes are either red or black
        for (Node node : nodes()) {
            if (!isRed(node) && !isBlack(node)) {
                return false;
            }
        }
        
        // Check BST property
        if (!isBST(root)) {
            return false;
        }
        
        // Check red nodes have black parents
        for (Node node : nodes()) {
            if (isRed(node) && (node.parent == null || isBlack(node.parent))) {
                return false;
            }
        }
        
        // Check size is correct
        if (size != nodes().size()) {
            return false;
        }
        
        // Check root is black
        if (!isBlack(root)) {
            return false;
        }
        
        return true;
    }


}
