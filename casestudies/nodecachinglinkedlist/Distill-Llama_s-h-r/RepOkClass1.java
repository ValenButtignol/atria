public class RepOkClass1{
    public boolean repOK_1() {
        // Check header and first node links
        if (header.next != firstCachedNode || firstCachedNode.previous != header) {
            return false;
        }
    
        // Check list size consistency
        int size = this.size;
        LinkedListNode current = header.next;
        int actualSize = 0;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        if (size != actualSize) {
            return false;
        }
    
        // Check cache size and structure
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if cache is properly linked
        if (firstCachedNode != null) {
            LinkedListNode nextCachedNode = firstCachedNode.next;
            if (nextCachedNode == null || nextCachedNode.previous != firstCachedNode) {
                return false;
            }
            // Check if the last cached node's next is null
            LinkedListNode lastCachedNode = nextCachedNode;
            while (lastCachedNode.next != null) {
                lastCachedNode = lastCachedNode.next;
            }
            if (lastCachedNode.next != null) {
                return false;
            }
        }
    
        return true;
    }


}
