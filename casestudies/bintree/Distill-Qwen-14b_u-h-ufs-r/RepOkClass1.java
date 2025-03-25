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
        
        Set<Node> visited = new HashSet<>();
        int nodeCount = 0;
        Node current = root;
        
        while (current != null) {
            if (!visited.add(current)) {
                return false; // Cycle detected
            }
            nodeCount++;
            // Traverse all children
            if (current.left != null) {
                Node left = current.left;
                while (left != null) {
                    if (!visited.add(left)) {
                        return false;
                    }
                    nodeCount++;
                    left = left.left;
                }
            }
            if (current.right != null) {
                Node right = current.right;
                while (right != null) {
                    if (!visited.add(right)) {
                        return false;
                    }
                    nodeCount++;
                    right = right.right;
                }
            }
            current = current.right; // Move to right child after processing left subtree
        }
        
        return nodeCount == size;
    }


}
