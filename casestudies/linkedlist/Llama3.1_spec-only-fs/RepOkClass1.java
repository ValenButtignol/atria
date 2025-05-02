public class RepOkClass1{
    public boolean repOK_1() {
        if (size != countNodes(header)) {
            return false;
        }
    
        if (!isAcyclic(header)) {
            return false;
        }
    
        if (containsNull(header)) {
            return false;
        }
    
        return true;
    }

    private boolean isAcyclic(Entry header) {
        Set<Entry> visited = new HashSet<>();
        return isAcyclicHelper(header, visited);
    }

    private boolean isAcyclicHelper(Entry node, Set<Entry> visited) {
        if (node == null) return true;
    
        if (visited.contains(node)) return false;
    
        visited.add(node);
    
        return isAcyclicHelper(node.next, visited) && isAcyclicHelper(node.prev, visited);
    }

    private boolean containsNull(Entry header) {
        return containsNullHelper(header);
    }

    private boolean containsNullHelper(Entry node) {
        if (node == null) return false;
    
        if (node.data == null) return true;
    
        return containsNullHelper(node.next);
    }

    private int countNodes(Entry header) {
        int count = 0;
        Entry node = header;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }


}
