public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header's next and previous are correctly set.
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if the size is consistent.
        if (size != numNodes(header)) {
            return false;
        }
    
        // Check for acyclic structure.
        if (!isAcyclic(header)) {
            return false;
        }
    
        // Check for duplicate elements.
        if (!noDuplicates(header)) {
            return false;
        }
    
        return true;
    }

    private boolean isAcyclic(Node header) {
        Set<Node> visited = new HashSet<>();
        visited.add(header);
        LinkedList<Node> workList = new LinkedList<>();
        workList.add(header);
    
        while (!workList.isEmpty()) {
            Node current = workList.removeFirst();
            if (current.next != null && !visited.add(current.next)) {
                return false;
            }
            if (current.previous != null && !visited.add(current.previous)) {
                return false;
            }
            if (current.next != null) {
                workList.add(current.next);
            }
            if (current.previous != null) {
                workList.add(current.previous);
            }
        }
    
        return true;
    }

    private boolean noDuplicates(Node header) {
        Set<Integer> seen = new HashSet<>();
        return noDuplicatesHelper(header, seen);
    }

    private boolean noDuplicatesHelper(Node node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
        if (seen.contains(node.element)) {
            return false;
        }
        seen.add(node.element);
        return noDuplicatesHelper(node.next, seen) && noDuplicatesHelper(node.previous, seen);
    }

    private int numNodes(Node header) {
        if (header == null) {
            return 0;
        }
        return 1 + numNodes(header.next) + numNodes(header.previous);
    }


}
