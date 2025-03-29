public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true; // Empty tree is valid
        }
    
        // Check AVL property
        if (!checkAvlProperty(root)) {
            return false;
        }
    
        // Check BST property
        if (!checkBstProperty(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check height consistency
        if (!checkHeightConsistency(root)) {
            return false;
        }
    
        // Check for cycles
        if (!checkNoCycles(root)) {
            return false;
        }
    
        return true;
    }

    private boolean checkAvlProperty(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left != null ? node.left.height : 0;
        int rightHeight = node.right != null ? node.right.height : 0;
    
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        return checkAvlProperty(node.left) && checkAvlProperty(node.right);
    }

    private boolean checkBstProperty(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.value <= min || node.value >= max) {
            return false;
        }
    
        return checkBstProperty(node.left, min, node.value) &&
               checkBstProperty(node.right, node.value, max);
    }

    private boolean checkHeightConsistency(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left != null ? node.left.height : 0;
        int rightHeight = node.right != null ? node.right.height : 0;
    
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        if (maxHeight != node.height) {
            return false;
        }
    
        return checkHeightConsistency(node.left) && checkHeightConsistency(node.right);
    }

    private boolean checkNoCycles(AvlNode node) {
        Set<AvlNode> visited = new HashSet<>();
        return checkNoCyclesHelper(node, visited);
    }

    private boolean checkNoCyclesHelper(AvlNode node, Set<AvlNode> visited) {
        if (node == null) {
            return true;
        }
    
        if (visited.contains(node)) {
            return false;
        }
    
        visited.add(node);
    
        return checkNoCyclesHelper(node.left, visited) &&
               checkNoCyclesHelper(node.right, visited);
    }


}
