public class RepOkClass1{
    public boolean repOK() {
        if (root == null && size != 0) {
            return false;
        }
        if (root == null && size == 0) {
            return true;
        }
        
        int nodeCount = 0;
        Set<Node> visited = new HashSet<>();
        Node current = root;
        
        // Check BST property and count nodes
        while (current != null) {
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            nodeCount++;
            
            // Check BST property: left subtree has smaller elements, right has larger
            if (current.left != null && current.left.element > current.element) {
                return false;
            }
            if (current.right != null && current.right.element < current.element) {
                return false;
            }
            
            current = current.left;
        }
        
        // Check balance for each node
        Node current = root;
        while (current != null) {
            int leftHeight = current.left == null ? -1 : current.left.height;
            int rightHeight = current.right == null ? -1 : current.right.height;
            int balanceFactor = leftHeight - rightHeight;
            
            if (balanceFactor > 1 || balanceFactor < -1) {
                return false;
            }
            
            current = current.left != null ? current.left : current.right;
        }
        
        // Check size consistency
        return nodeCount == size;
    }


}
