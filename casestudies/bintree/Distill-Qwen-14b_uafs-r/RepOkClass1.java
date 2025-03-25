public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return root == null;
        }
    
        int nodeCount = 0;
        Set<Node> visitedNodes = new HashSet<>();
        Node current = root;
    
        while (current != null) {
            if (!visitedNodes.add(current)) {
                return false; // Detected a cycle
            }
    
            nodeCount++;
            // Visit left child first
            if (current.left != null) {
                if (!visitedNodes.contains(current.left)) {
                    current = current.left;
                } else {
                    return false; // Left child already visited, cycle detected
                }
            } else {
                // Move to right child if left is null
                if (current.right != null) {
                    current = current.right;
                } else {
                    current = null; // No more nodes to visit
                }
            }
        }
    
        return nodeCount == size;
    }


}
