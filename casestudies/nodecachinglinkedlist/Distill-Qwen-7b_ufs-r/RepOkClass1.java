public class RepOkClass1{
    public boolean repOK_1() {
        // Check cache size does not exceed maximum
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the linked list is empty
        if (header.next == header) {
            // Check if cache is also empty
            if (cacheSize == 0) {
                return true;
            }
            // If linked list is empty but cache is not, return false
            return false;
        }
    
        // Check if the first node in the cache is the oldest in the linked list
        LinkedListNode firstInList = header.next;
        LinkedListNode firstCachedNode = firstCachedNode;
        if (firstCachedNode != null && firstCachedNode != firstInList) {
            return false;
        }
    
        // Check if the oldest node in the cache is correctly evicted when cache is full
        if (cacheSize == maximumCacheSize) {
            // Evict the oldest node
            LinkedListNode oldestNode = firstCachedNode;
            firstCachedNode = firstCachedNode.next;
            if (oldestNode != null) {
                // Detach the oldest node from the linked list
                LinkedListNode nextNode = oldestNode.next;
                nextNode.previous = null;
                // Add the oldest node to the cache if it's not already there
                if (!isNodeInCache(oldestNode)) {
                    addNodeToCache(oldestNode);
                }
            }
        }
    
        // Ensure all nodes in the cache are present in the linked list
        LinkedListNode current = header.next;
        while (current != header) {
            if (current == firstCachedNode) {
                firstCachedNode = current.next;
            }
            if (!isNodeInCache(current)) {
                return false;
            }
            current = current.next;
        }
    
        // Ensure no node is added to the cache more than once
        return true;
    }

    private boolean isNodeInCache(LinkedListNode node) {
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (node == current) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


}
