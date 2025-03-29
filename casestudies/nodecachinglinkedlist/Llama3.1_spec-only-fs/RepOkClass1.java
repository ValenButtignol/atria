public class RepOkClass1{
    public boolean repOK() {
        if (size != countNodes(header)) {
            return false;
        }
    
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        if (!isCacheConsistent()) {
            return false;
        }
    
        if (!noDuplicates()) {
            return false;
        }
    
        return true;
    }

    private boolean isCacheConsistent() {
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (!contains(current.value)) {
                return false;
            }
            current = current.nextCached;
        }
        return true;
    }

    private boolean noDuplicates() {
        Set<Object> seen = new HashSet<>();
        return noDuplicatesHelper(header, seen);
    }

    private boolean noDuplicatesHelper(LinkedListNode node, Set<Object> seen) {
        if (node == null) return true;
    
        if (!seen.add(node.value)) return false;
    
        return noDuplicatesHelper(node.next, seen);
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }


}
