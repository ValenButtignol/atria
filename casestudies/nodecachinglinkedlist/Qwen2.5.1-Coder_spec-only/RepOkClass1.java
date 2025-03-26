public class RepOkClass1{
    public boolean repOK() {
        // Check if the header node is not null
        if (header == null) {
            return false;
        }
    
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the cache size is non-negative
        if (cacheSize < 0) {
            return false;
        }
    
        // Check if the maximum cache size is non-negative
        if (maximumCacheSize < 0) {
            return false;
        }
    
        // Check if the maximum cache size is at least the cache size
        if (maximumCacheSize < cacheSize) {
            return false;
        }
    
        // Check if the linked list is circular
        LinkedListNode current = header;
        int count = 0;
        do {
            current = current.next;
            count++;
        } while (current != header && count <= size);
    
        if (current != header) {
            return false;
        }
    
        // Check if the first cached node is null if cache size is 0
        if (cacheSize == 0 && firstCachedNode != null) {
            return false;
        }
    
        // Check if the first cached node is within the linked list
        if (firstCachedNode != null && !isNodeInList(firstCachedNode)) {
            return false;
        }
    
        // Check if all nodes in the cache are within the linked list
        current = firstCachedNode;
        for (int i = 0; i < cacheSize; i++) {
            if (!isNodeInList(current)) {
                return false;
            }
            current = current.next;
        }
    
        // Check if all nodes in the linked list are unique
        if (!areNodesUnique()) {
            return false;
        }
    
        return true;
    }

    private boolean isNodeInList(LinkedListNode node) {
        LinkedListNode current = header;
        int count = 0;
        do {
            if (current == node) {
                return true;
            }
            current = current.next;
            count++;
        } while (current != header && count <= size);
    
        return false;
    }

    private boolean areNodesUnique() {
        LinkedListNode current = header;
        int count = 0;
        Set<Object> values = new HashSet<>();
        do {
            if (!values.add(current.value)) {
                return false;
            }
            current = current.next;
            count++;
        } while (current != header && count <= size);
    
        return true;
    }


}
