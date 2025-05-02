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
            current = current.left;
            if (current != null) {
                current = current.right;
            }
        }
    
        if (nodeCount != size) {
            return false;
        }
    
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.color == RED) {
                if (currentNode.left != null && currentNode.left.color == RED) {
                    return false;
                }
                if (currentNode.right != null && currentNode.right.color == RED) {
                    return false;
                }
            }
            currentNode = currentNode.left;
            if (currentNode != null) {
                currentNode = currentNode.right;
            }
        }
    
        return true;
    }


}
