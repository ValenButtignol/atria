public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the list is empty
        if (size == 0) {
            return header.next == header && header.previous == header;
        }
    
        // Traverse the list to check for cycles and proper linking
        Set<Node> visited = new HashSet<>();
        Node current = header.next;
        while (current != header) {
            if (visited.contains(current)) {
                return false; // Cycle detected
            }
            visited.add(current);
            current = current.next;
        }
    
        // Check that each node has a valid previous and next
        for (Node node : visited) {
            if (node.previous == null || node.next == null) {
                return false;
            }
        }
    
        // Check that the size is correct
        if (numNodes(header.next) != size) {
            return false;
        }
    
        return true;
    }

    private int numNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.next);
    }


}
