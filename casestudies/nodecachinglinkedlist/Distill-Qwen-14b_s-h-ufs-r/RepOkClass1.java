public class RepOkClass1{
    public boolean repOK_1() {
        // Check header's previous and next
        if (header.getPrevious() != header || header.getNext() == null) {
            return false;
        }
    
        // Check main list structure and size
        int mainSize = 0;
        LinkedListNode current = header.getNext();
        while (current != header) {
            mainSize++;
            if (current.getPrevious() == null || current.getNext() == null) {
                return false;
            }
            current = current.getNext();
        }
        if (mainSize != size) {
            return false;
        }
    
        // Check cache size bounds
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check cache structure
        if (cacheSize > 0) {
            if (firstCachedNode == null) {
                return false;
            }
            if (firstCachedNode.getPrevious() != null) {
                return false;
            }
            int cachedNodes = 0;
            LinkedListNode cacheCurrent = firstCachedNode;
            LinkedListNode prevCached = null;
            while (cacheCurrent != null) {
                cachedNodes++;
                if (cacheCurrent.getValue() != null) {
                    return false;
                }
                if (prevCached != null) {
                    if (cacheCurrent.getPrevious() != prevCached) {
                        return false;
                    }
                }
                prevCached = cacheCurrent;
                cacheCurrent = cacheCurrent.getNext();
            }
            if (cachedNodes != cacheSize) {
                return false;
            }
        }
    
        return true;
    }


}
