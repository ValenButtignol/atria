public class RepOkClass1{
    public boolean repOK() {
        // Check cache size is within valid range
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // If cache is empty, check that header's next is null
        if (cacheSize == 0) {
            if (header.next != null) {
                return false;
            }
            return true;
        }
    
        // Check first node in cache
        LinkedListNode firstCacheNode = firstCachedNode;
        if (firstCacheNode == null) {
            return false;
        }
    
        // Check last node in cache
        LinkedListNode lastCacheNode = firstCacheNode;
        while (lastCacheNode.next != null) {
            lastCacheNode = lastCacheNode.next;
        }
        if (lastCacheNode.next != null) {
            return false;
        }
    
        // Check header's next is firstCacheNode
        if (header.next != firstCacheNode) {
            return false;
        }
    
        // Check header's previous is null
        if (header.previous != null) {
            return false;
        }
    
        // Check all values in cache are unique
        Set<Object> seenValues = new HashSet<>();
        for (LinkedListNode node = firstCacheNode; node != null; node = node.next) {
            Object value = node.getValue();
            if (value == null) {
                return false; // Assuming null values are not allowed
            }
            if (seenValues.contains(value)) {
                return false;
            }
            seenValues.add(value);
        }
    
        // Check cache is a valid doubly linked list
        LinkedListNode current = firstCacheNode;
        while (current != null) {
            // Check previous
            if (current.previous != null && current.previous.next != current) {
                return false;
            }
            // Check next
            if (current.next != null && current.next.previous != current) {
                return false;
            }
            current = current.next;
        }
    
        // Check entire linked list is properly linked
        // Header's previous is null
        if (header.previous != null) {
            return false;
        }
    
        // Last node's next is null
        LinkedListNode lastNode = header;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        if (lastNode.next != null) {
            return false;
        }
    
        return true;
    }


}
