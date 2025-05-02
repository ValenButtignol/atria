public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the header is a sentinel node
        if (header.previous != header || header.next != header) {
            return false;
        }
    
        // Check that size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check that cacheSize is within the valid range
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check that firstCachedNode is consistent with cacheSize
        if (cacheSize != 0 && firstCachedNode == null) {
            return false;
        }
        if (cacheSize == 0 && firstCachedNode != null) {
            return false;
        }
    
        // Check that all cached nodes have null values
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (current.getValue() != null) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
