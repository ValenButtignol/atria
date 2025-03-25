public class RepOkClass1{
    public boolean repOK() {
        // Check header's previous and next point to itself
        if (header.previous != header || header.next != header) {
            return false;
        }
    
        // Check main list size and node values
        int mainSize = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            mainSize++;
            if (node.getValue() == null && node != header) {
                return false;
            }
        }
        if (mainSize != size) {
            return false;
        }
    
        // Check cache size constraints
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check cache contents if cache is non-empty
        if (cacheSize > 0) {
            if (firstCachedNode == null) {
                return false;
            }
    
            int cacheCount = 0;
            LinkedListNode current = firstCachedNode;
            while (current != null) {
                cacheCount++;
                if (current.getValue() != null) {
                    return false;
                }
                if (current.previous != null) {
                    return false;
                }
                current = current.next;
            }
    
            if (cacheCount != cacheSize) {
                return false;
            }
        }
    
        return true;
    }


}
