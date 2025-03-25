public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        Set<Node> visited = new HashSet<>();
        Queue<Node> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(root);
    
        int nodeCount = 0;
    
        while (!nodesToVisit.isEmpty()) {
            Node current = nodesToVisit.remove();
            nodeCount++;
    
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
    
            if (current.left != null) {
                nodesToVisit.add(current.left);
            }
            if (current.right != null) {
                nodesToVisit.add(current.right);
            }
        }
    
        return nodeCount == size;
    }


}
