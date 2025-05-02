public class RepOkClass1{
    public boolean repOK_1() {
        // Check header's previous and next point to itself
        if (header.previous != header || header.next != header) {
            return false;
        }
    
        // Check all nodes except header have valid previous and next
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (node.previous == null || node.next == null) {
                return false;
            }
        }
    
        // Check size is consistent with actual node count
        int actualSize = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            actualSize++;
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check cache size is within bounds
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check cached nodes have null values
        LinkedListNode cachedNode = firstCachedNode;
        while (cachedNode != null) {
            if (cachedNode.getValue() != null) {
                return false;
            }
            cachedNode = cachedNode.next;
        }
    
        // Check firstCachedNode is only non-null if cacheSize > 0
        if (cacheSize > 0 && firstCachedNode == null) {
            return false;
        }
    
        // Check linked list forms a cycle
        LinkedListNode currentNode = header.next;
        while (currentNode != header) {
            if (currentNode.next == null || currentNode.previous == null) {
                return false;
            }
            currentNode = currentNode.next;
        }
    
        return true;
    }


}
