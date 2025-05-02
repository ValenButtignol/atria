public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        // Check all nodes are either red or black
        if (!isNodeRedOrBlack(root)) {
            return false;
        }
    
        // Check root is black
        if (!root.isBlack()) {
            return false;
        }
    
        // Check BST property for all nodes
        if (!isBSTPropertySatisfied(root)) {
            return false;
        }
    
        // Check no two red nodes are adjacent
        if (!isRedNodeNotAdjacent(root)) {
            return false;
        }
    
        // Check size consistency
        if (size != countNodes(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isNodeRedOrBlack(Node node) {
        return node != null ? (node.isRed() || node.isBlack()) : true;
    }

    private boolean isBSTPropertySatisfied(Node node) {
        if (node == null) {
            return true;
        }
    
        int key = node.getKey();
        int leftKey = (node.left != null) ? node.left.getKey() : Integer.MIN_VALUE;
        int rightKey = (node.right != null) ? node.right.getKey() : Integer.MAX_VALUE;
    
        if (leftKey != Integer.MIN_VALUE && leftKey >= key) {
            return false;
        }
    
        if (rightKey != Integer.MAX_VALUE && rightKey <= key) {
            return false;
        }
    
        return isBSTPropertySatisfied(node.left) && isBSTPropertySatisfied(node.right);
    }

    private boolean isRedNodeNotAdjacent(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.isRed()) {
            if (node.parent != null && node.parent.isRed()) {
                return false;
            }
        }
    
        return isRedNodeNotAdjacent(node.left) && isRedNodeNotAdjacent(node.right);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
    
        int count = 1;
    
        if (node.left != null) {
            count += countNodes(node.left);
        }
    
        if (node.right != null) {
            count += countNodes(node.right);
        }
    
        return count;
    }


}
