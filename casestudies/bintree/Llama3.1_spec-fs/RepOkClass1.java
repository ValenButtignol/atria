public class RepOkClass1{
    public boolean repOK_1() {
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
            current = current.left != null ? current.left : current.right;
        }
    
        return nodeCount == size;
    }


}
