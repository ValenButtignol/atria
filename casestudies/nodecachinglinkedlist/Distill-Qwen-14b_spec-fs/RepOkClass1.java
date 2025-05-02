public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the cache size does not exceed the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check that the size of the linked list is consistent with the actual number of nodes
        int actualSize = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check that the linked list is acyclic
        Set<LinkedListNode> visited = new HashSet<>();
        LinkedListNode currentCheck = header.next;
        while (currentCheck != header) {
            if (visited.contains(currentCheck)) {
                return false; // Cycle detected
            }
            visited.add(currentCheck);
            currentCheck = currentCheck.next;
        }
    
        // Check that the firstCachedNode is either null or points to a valid cached node
        if (firstCachedNode != null) {
            if (cacheSize == 0) {
                return false;
            }
            LinkedListNode cachedNode = firstCachedNode;
            int count = 0;
            while (cachedNode != null && count < cacheSize) {
                if (cachedNode.value != null) {
                    return false; // Cached node should have null value
                }
                cachedNode = cachedNode.next;
                count++;
            }
        }
    
        // Check that the header's previous and next point to itself
        if (header.previous != header || header.next != header) {
            return false;
        }
    
        // Check that all nodes have correct previous and next pointers
        LinkedListNode node = header.next;
        while (node != header) {
            if (node.previous == null || node.next == null) {
                return false; // Node has null previous or next
            }
            node = node.next;
        }
    
        return true;
    }


}
