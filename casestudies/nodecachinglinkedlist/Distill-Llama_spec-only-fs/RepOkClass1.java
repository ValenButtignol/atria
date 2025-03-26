public class RepOkClass1{
    public boolean repOK() {
        // Check if the header is not null
        if (header == null) {
            return false;
        }
    
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the cache size is within the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the first cached node is correctly set
        if (firstCachedNode != null && firstCachedNode != header) {
            return false;
        }
    
        // Check if the cache size is not greater than the maximum
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the size is consistent with the number of nodes in the cache
        if (size != (cacheSize + (header.next != null ? 1 : 0))) {
            return false;
        }
    
        // Check if the linked list structure is acyclic
        if (!isListACyclic()) {
            return false;
        }
    
        // Check if all nodes have unique values
        if (!allNodesHaveUniqueValues()) {
            return false;
        }
    
        return true;
    }

    private boolean isListACyclic() {
        LinkedListNode current = header;
        while (current != null && current.next != null) {
            current = current.next;
            if (current != header && current == header.previous) {
                return false;
            }
        }
        return true;
    }

    private boolean allNodesHaveUniqueValues() {
        Set<Object> seenValues = new HashSet<>();
        LinkedListNode current = header;
        while (current != null) {
            if (seenValues.contains(current.value)) {
                return false;
            }
            seenValues.add(current.value);
            current = current.next;
        }
        return true;
    }


}
