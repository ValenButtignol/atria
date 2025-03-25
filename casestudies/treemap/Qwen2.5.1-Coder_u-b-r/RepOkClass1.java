public class RepOkClass1{
    public boolean repOK() {
        // Root property: The root node is always black.
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        // Leaf property: All leaf nodes (NIL nodes) are black.
        // We can't directly check leaf nodes since they are not explicitly represented.
        // Instead, we rely on the Red-Black properties to ensure they are black.
    
        // Red property: Red nodes cannot have red children.
        if (!isRedOK(root)) {
            return false;
        }
    
        // Black property: All paths from any node to its descendant NIL nodes must have the same number of black nodes.
        if (!isBlackHeightEqual(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isRedOK(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
        return isRedOK(node.left) && isRedOK(node.right);
    }

    private boolean isBlackHeightEqual(Node node) {
        if (node == null) {
            return true;
        }
        int leftBlackHeight = blackHeight(node.left);
        int rightBlackHeight = blackHeight(node.right);
        return leftBlackHeight == rightBlackHeight && isBlackHeightEqual(node.left) && isBlackHeightEqual(node.right);
    }

    private int blackHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftBlackHeight = blackHeight(node.left);
        int rightBlackHeight = blackHeight(node.right);
        if (leftBlackHeight != rightBlackHeight) {
            return -1; // Not a valid Red-Black Tree
        }
        return node.color == BLACK ? leftBlackHeight + 1 : leftBlackHeight;
    }


}
