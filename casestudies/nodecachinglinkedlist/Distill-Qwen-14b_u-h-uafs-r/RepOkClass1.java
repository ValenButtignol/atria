public class RepOkClass1{
    public boolean repOK_1() {
        // Check header is not null
        if (header == null) {
            return false;
        }
    
        // Check size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check cache size is within bounds
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check header's previous and next
        if (header.getPreviousNode() != header || header.getNextNode() != header) {
            return false;
        }
    
        // Check all nodes have valid previous and next pointers
        LinkedListNode currentNode = header.getNextNode();
        while (currentNode != header) {
            if (currentNode.getPreviousNode() == null || currentNode.getNextNode() == null) {
                return false;
            }
            currentNode = currentNode.getNextNode();
        }
    
        // Check firstCachedNode is either null or a valid cached node
        if (firstCachedNode != null && !isCached(firstCachedNode)) {
            return false;
        }
    
        // Check all cached nodes have null values
        LinkedListNode cachedNode = firstCachedNode;
        while (cachedNode != null) {
            if (cachedNode.getValue() != null) {
                return false;
            }
            cachedNode = cachedNode.getNextNode();
        }
    
        // Check size matches the number of active nodes
        int activeNodes = countActiveNodes();
        if (activeNodes != size) {
            return false;
        }
    
        return true;
    }

    private boolean isCached(LinkedListNode node) {
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (current == node) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    private int countActiveNodes() {
        int count = 0;
        LinkedListNode currentNode = header.getNextNode();
        while (currentNode != header) {
            if (currentNode.getValue() != null) {
                count++;
            }
            currentNode = currentNode.getNextNode();
        }
        return count;
    }


}
