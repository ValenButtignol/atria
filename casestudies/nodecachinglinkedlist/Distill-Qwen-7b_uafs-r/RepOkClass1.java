public class RepOkClass1{
    public boolean repOK() {
        // Check 1: Cache size does not exceed maximumCacheSize
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check 2: Size of linked list equals cache size
        if (size != cacheSize) {
            return false;
        }
    
        // Check 3: Header's next points to the first node or null if empty
        LinkedListNode headerNode = header;
        if (headerNode.next != null) {
            if (headerNode.next != firstCachedNode) {
                return false;
            }
        } else {
            if (firstCachedNode != null) {
                return false;
            }
        }
    
        // Check 4: Cache contains only nodes present in the linked list
        while (firstCachedNode != null) {
            LinkedListNode cachedNode = firstCachedNode;
            firstCachedNode = cachedNode.next;
            cachedNode.next = null; // Prevent cycles
    
            if (cachedNode.getValue() != null) {
                LinkedListNode linkedListNode = header.next;
                while (linkedListNode != null) {
                    if (cachedNode.getValue() == linkedListNode.getValue()) {
                        return false; // Duplicate found in cache
                    }
                    linkedListNode = linkedListNode.next;
                }
            }
        }
    
        return true;
    }


}
