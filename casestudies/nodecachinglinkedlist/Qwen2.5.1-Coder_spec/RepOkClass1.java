public class RepOkClass1{
    public boolean repOK() {
        // Check if the linked list is circular
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the cache size is non-negative and does not exceed the maximum cache size
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the firstCachedNode is valid if the cache size is greater than zero
        if (cacheSize > 0 && firstCachedNode == null) {
            return false;
        }
    
        // Check if all nodes in the linked list have valid previous and next pointers
        LinkedListNode node = header.next;
        int count = 0;
        while (node != header) {
            if (node.previous == null || node.next == null) {
                return false;
            }
            node = node.next;
            count++;
        }
        if (count != size) {
            return false;
        }
    
        // Check if all nodes in the cache have valid previous and next pointers
        node = firstCachedNode;
        count = 0;
        while (node != null) {
            if (node.previous == null || node.next == null) {
                return false;
            }
            node = node.next;
            count++;
        }
        if (count != cacheSize) {
            return false;
        }
    
        return true;
    }


}
