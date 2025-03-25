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
    
        int nodeCount = 0;
        Set<Node> visitedNodes = new HashSet<>();
        Node current = root;
    
        while (current != null) {
            if (!visitedNodes.add(current)) {
                return false;
            }
    
            nodeCount++;
            current = getSmallestNode(current);
        }
    
        return nodeCount == size;
    }

    private Node getSmallestNode(Node current) {
        if (current.left == null) {
            return current.right;
        } else {
            return getSmallestNode(current.left);
        }
    }


}
