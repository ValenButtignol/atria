public class RepOkClass1{
    public boolean repOK() {
        // Check if the header's next is the first node and the first node's previous is the header
        if (header.next != header || header.next != firstCachedNode) {
            return false;
        }
    
        // Check if the size matches the count of nodes
        if (size != 0) {
            int count = 0;
            LinkedListNode current = header.next;
            while (current != header) {
                count++;
                current = current.next;
            }
            if (count != size) {
                return false;
            }
        }
    
        // Check if the cache size is within the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the first cached node is properly linked
        if (firstCachedNode != null) {
            if (firstCachedNode.next == null || firstCachedNode.next != header.next) {
                return false;
            }
            if (firstCachedNode.previous != null || firstCachedNode.previous != header) {
                return false;
            }
        }
    
        // Check if the first cached node is properly detached when removed
        if (firstCachedNode != null && firstCachedNode.next == null && firstCachedNode.previous != null) {
            return false;
        }
    
        return true;
    }


}
