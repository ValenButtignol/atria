public class RepOkClass1{
    public boolean repOK() {
        // Check if the header node is correctly set up
        if (header == null) {
            return false;
        }
        if (header.next == null || header.previous == null) {
            return false;
        }
        if (header.next != header.previous) {
            return false;
        }
    
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the cacheSize is non-negative and does not exceed maximumCacheSize
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the firstCachedNode is correctly set up if cacheSize is greater than 0
        if (cacheSize > 0 && (firstCachedNode == null || firstCachedNode.next == null)) {
            return false;
        }
    
        // Check if the linked list is consistent
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            if (current.previous == null || current.next == null) {
                return false;
            }
            current = current.next;
        }
        if (count != size) {
            return false;
        }
    
        // Check if the cache is consistent
        current = firstCachedNode;
        while (current != null) {
            if (current.previous == null || current.next == null) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
