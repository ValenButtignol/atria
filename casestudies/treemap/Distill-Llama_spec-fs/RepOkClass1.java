public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        Set<Node> visitedNodes = new HashSet<>();
        int nodeCount = 0;
    
        // Check for cycles and count nodes
        boolean cycleDetected = false;
        for (Node current = root; current != null; current = current.parent) {
            if (visitedNodes.contains(current)) {
                cycleDetected = true;
                break;
            }
            visitedNodes.add(current);
            nodeCount++;
        }
    
        if (cycleDetected || nodeCount != size) {
            return false;
        }
    
        // Check heap property
        for (Node node = root; node != null; node = node.left) {
            if (node.right != null && node.value > node.right.value) {
                return false;
            }
            if (node.left != null && node.value <= node.left.value) {
                return false;
            }
        }
    
        // Check balance
        boolean balanced = true;
        if (root.left != null || root.right != null) {
            balanced = isBalanced(root);
        }
    
        return balanced;
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = isBalanced(node.left);
        int rightHeight = isBalanced(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return 2; // Indicate imbalance
        }
    
        return Math.max(leftHeight, rightHeight) + 1;
    }


}
