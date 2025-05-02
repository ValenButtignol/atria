public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size matches the actual number of nodes
        if (size != countNodes(header)) {
            return false;
        }
    
        // Check if the cacheSize is within allowed bounds
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the header points correctly
        if (header.next != firstCachedNode) {
            return false;
        }
    
        // Check if the header's previous points to itself
        if (header.previous != header) {
            return false;
        }
    
        // Check if the tail's next points to itself
        LinkedListNode tail = getTail();
        if (tail.next != tail) {
            return false;
        }
    
        // Check if each node has exactly one previous and next
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            if (current.previous == null || current.next == null) {
                return false;
            }
            count++;
            current = current.next;
        }
    
        // Check if the number of cached nodes matches cacheSize
        if (!isCacheConsistent(firstCachedNode, cacheSize)) {
            return false;
        }
    
        // Check if the removeNode method maintains the cache correctly
        if (!checkRemoveNodeMaintainsCache(firstCachedNode, header, cacheSize)) {
            return false;
        }
    
        return true;
    }

    private int countNodes(LinkedListNode header) {
        LinkedListNode current = header.next;
        int count = 0;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }

    private LinkedListNode getTail() {
        LinkedListNode current = header.next;
        while (current.next != header) {
            current = current.next;
        }
        return current;
    }

    private boolean isCacheConsistent(LinkedListNode firstCachedNode, int cacheSize) {
        if (firstCachedNode == null) {
            return cacheSize == 0;
        }
        return (cacheSize == 0) || (cacheSize > 0 && firstCachedNode != null);
    }

    private boolean checkRemoveNodeMaintainsCache(LinkedListNode firstCachedNode, LinkedListNode header, int cacheSize) {
        if (cacheSize == 0) {
            return true;
        }
        LinkedListNode nodeToRemove = getNodeFromCache();
        if (nodeToRemove == null) {
            return true;
        }
        removeNode(nodeToRemove);
        addNodeToCache(nodeToRemove);
        return true;
    }


}
