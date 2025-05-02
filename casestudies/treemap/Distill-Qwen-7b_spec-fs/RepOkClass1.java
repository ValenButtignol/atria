public class RepOkClass1{
    public boolean repOK_1() {
        if (size != 0 && root == null) {
            return false;
        }
        if (size == 0 && root != null) {
            return false;
        }
        if (comparator == null) {
            return false;
        }
    
        // Check root color
        if (!isRootBlack()) {
            return false;
        }
    
        // Check all nodes for red properties
        if (!isAllNodesRedOrBlack()) {
            return false;
        }
    
        // Check size consistency
        if (size != countNodes()) {
            return false;
        }
    
        return true;
    }

    private boolean isRootBlack() {
        if (root == null) {
            return true; // Root is null, trivially satisfies
        }
        return root.color == BLACK;
    }

    private boolean isAllNodesRedOrBlack() {
        if (root == null) {
            return true;
        }
        return isNodeRedOrBlack(root);
    }

    private boolean isNodeRedOrBlack(Node node) {
        if (node == null) {
            return true; // Null nodes are considered black
        }
        return node.color == RED || node.color == BLACK;
    }

    private int countNodes() {
        int count = 0;
        Node current = root;
        while (current != null) {
            count++;
            current = current.right;
        }
        return count;
    }


}
