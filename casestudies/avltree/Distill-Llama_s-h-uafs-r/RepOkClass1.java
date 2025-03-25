public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true; // Empty tree is valid
        }
    
        // Check for cycles and multiple children
        Set<Node> visitedNodes = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (visitedNodes.contains(current)) {
                return false; // Cycle detected
            }
            visitedNodes.add(current);
    
            // Ensure each node has at most one child
            if (current.left != null && current.right != null) {
                return false;
            }
    
            // Enqueue children
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    
        return true;
    }


}
