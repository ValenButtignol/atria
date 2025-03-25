public class RepOkClass1{
    public boolean repOK() {
        // Check header's previous and next point to itself
        if (header.getPreviousNode() != header || header.getNextNode() != header) {
            return false;
        }
    
        // Check size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check cache size is within bounds
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check all cached nodes have null values
        LinkedListNode currentCached = firstCachedNode;
        while (currentCached != null) {
            if (currentCached.getValue() != null) {
                return false;
            }
            currentCached = currentCached.getNextNode();
        }
    
        // Check linked list structure and size consistency
        LinkedListNode current = header.getNextNode();
        int count = 0;
        while (current != header) {
            if (current.getPreviousNode() == null || current.getPreviousNode().getNextNode() != current) {
                return false;
            }
            current = current.getNextNode();
            count++;
        }
        if (count != size) {
            return false;
        }
    
        return true;
    }


}
