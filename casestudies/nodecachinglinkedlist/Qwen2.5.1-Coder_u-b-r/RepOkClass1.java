public class RepOkClass1{
    public boolean repOK_1() {
        // Check if header points to itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if cacheSize is non-negative and does not exceed maximumCacheSize
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if firstCachedNode is null or points to a valid node in the cache
        LinkedListNode node = firstCachedNode;
        while (node != null) {
            if (node.next == null || node.previous == null) {
                return false;
            }
            node = node.next;
        }
    
        // Check if maximumCacheSize is a positive integer
        if (maximumCacheSize <= 0) {
            return false;
        }
    
        // Check if all nodes in the list are valid
        int count = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            count++;
            if (node.previous == null || node.next == null) {
                return false;
            }
        }
    
        // Check if count matches the size
        return count == size;
    }


}
