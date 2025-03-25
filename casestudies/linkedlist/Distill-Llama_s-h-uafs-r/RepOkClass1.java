public class RepOkClass1{
    public boolean repOK() {
        if (size() == 0) {
            // An empty linked list is valid
            return true;
        }
    
        // Check for cycles using DFS
        if (!isCycleFree(header)) {
            return false;
        }
    
        // Check for duplicates
        if (!hasDuplicates(header)) {
            return false;
        }
    
        // Check the order of elements
        if (!isOrdered(header)) {
            return false;
        }
    
        // Check the structure: each node should have correct next and previous pointers
        if (!isStructureValid(header)) {
            return false;
        }
    
        return true;
    }

    private boolean isCycleFree(Node header) {
        Set<Node> visited = new HashSet<>();
        visited.add(header);
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(header);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.next != null && visited.contains(current.next)) {
                return false;
            }
            if (current.next != null) {
                visited.add(current.next);
                stack.add(current.next);
            }
        }
        return true;
    }

    private boolean hasDuplicates(Node header) {
        Set<Object> seen = new HashSet<>();
        return !hasDuplicatesHelper(header, seen);
    }

    private boolean hasDuplicatesHelper(Node node, Set<Object> seen) {
        if (node == null) {
            return true;
        }
        if (seen.contains(node.element)) {
            return false;
        }
        seen.add(node.element);
        return hasDuplicatesHelper(node.next, seen) && hasDuplicatesHelper(node.previous, seen);
    }

    private boolean isOrdered(Node header) {
        return isOrderedHelper(header, null, null);
    }

    private boolean isOrderedHelper(Node node, Object min, Object max) {
        if (node == null) {
            return true;
        }
        if (node.element != null) {
            if (min != null && node.element <= min) {
                return false;
            }
            if (max != null && node.element >= max) {
                return false;
            }
        }
        boolean leftOk = isOrderedHelper(node.left, min, node.element);
        boolean rightOk = isOrderedHelper(node.right, node.element, max);
        return leftOk && rightOk;
    }

    private boolean isStructureValid(Node header) {
        if (header.next != header.previous) {
            return false;
        }
        if (header.next != null && header.next.next != header) {
            return false;
        }
        return true;
    }


}
