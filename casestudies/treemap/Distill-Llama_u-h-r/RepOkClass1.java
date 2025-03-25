public class RepOkClass1{
    public boolean repOK() {
        // Check if comparator is null
        if (comparator == null) {
            return false;
        }
    
        // Check if root is null
        if (root == null) {
            return size == 0;
        }
    
        // Check if size is consistent with the number of nodes
        if (size != (root == null ? 0 : (leftmostNode() != null ? leftmostNode().size() : 0))) {
            return false;
        }
    
        // Check parent-child links
        if (!checkParentChildLinks()) {
            return false;
        }
    
        // Check root color
        if (root.color != BLACK) {
            return false;
        }
    
        // Check if fixInsertion has been called after insertion
        if (size > 0 && !hasFixInsertionBeenCalled()) {
            return false;
        }
    
        return true;
    }

    private boolean checkParentChildLinks() {
        if (root == null) {
            return true;
        }
    
        // Check root's parent
        if (root.parent != null) {
            return false;
        }
    
        // Check all other nodes
        for (Node node : allNodes()) {
            if (node.parent == null) {
                return false;
            }
            if (node.parent.left == node || node.parent.right == node) {
                return false;
            }
        }
    
        return true;
    }

    private boolean hasFixInsertionBeenCalled() {
        // Check if any node has been rotated
        if (root != null && root.color == RED) {
            return false;
        }
    
        // Check if any rotation occurred during insertion
        if (hasRotationOccurred()) {
            return true;
        }
    
        return false;
    }

    private boolean hasRotationOccurred() {
        return (root != null && root.color == RED) || (root.left != null && root.left.color == RED) || 
               (root.right != null && root.right.color == RED);
    }


}
