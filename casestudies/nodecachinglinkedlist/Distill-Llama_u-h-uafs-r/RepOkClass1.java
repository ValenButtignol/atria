public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the cache size exceeds the maximum allowed
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check for duplicates in the cache
        Set<Object> seenValues = new HashSet<>();
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            Object value = current.getValue();
            if (seenValues.contains(value)) {
                return false;
            }
            seenValues.add(value);
            current = current.next;
        }
    
        // Check that the cache forms a contiguous block in the linked list
        if (firstCachedNode != null) {
            LinkedListNode previousCachedNode = null;
            current = firstCachedNode;
            while (current != null) {
                // Ensure each node's previous pointer correctly points to the previous node in the cache
                if (current.previous != previousCachedNode) {
                    return false;
                }
                previousCachedNode = current;
                current = current.next;
            }
        }
    
        return true;
    }


}
