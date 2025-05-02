public class RepOkClass1{
    public boolean repOK_1() {
        // Check header node's previous points to itself
        if (header.getPreviousNode() != header) {
            return false;
        }
    
        // Check main linked list size consistency
        int count = 0;
        LinkedListNode current = header.getNextNode();
        while (current != header) {
            count++;
            current = current.getNextNode();
        }
        if (count != size) {
            return false;
        }
    
        // Check cache size does not exceed maximum
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check cache structure and node values
        if (firstCachedNode != null) {
            int cachedCount = 0;
            LinkedListNode currentCached = firstCachedNode;
            LinkedListNode prevCached = null;
            while (currentCached != null) {
                cachedCount++;
                if (currentCached.getValue() != null) {
                    return false;
                }
                if (prevCached != null && currentCached.getPreviousNode() != prevCached) {
                    return false;
                }
                prevCached = currentCached;
                currentCached = currentCached.getNextNode();
            }
            if (cachedCount != cacheSize) {
                return false;
            }
        }
    
        return true;
    }


}
