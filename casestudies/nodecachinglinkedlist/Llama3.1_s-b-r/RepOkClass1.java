public class RepOkClass1{
    public boolean repOK() {
        // Check if the header node is correctly initialized
        if (header == null || header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if the size of the list is correct
        if (size != countNodes(header)) {
            return false;
        }
    
        // Check if the cache is correctly initialized
        if (firstCachedNode != null && firstCachedNode.next != null) {
            return false;
        }
    
        // Check if the cache size is correct
        if (cacheSize != countCachedNodes(firstCachedNode)) {
            return false;
        }
    
        // Check if the maximum cache size is correct
        if (maximumCacheSize != DEFAULT_MAXIMUM_CACHE_SIZE) {
            return false;
        }
    
        // Check if all nodes in the list have correct references
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (node.previous != node.getPreviousNode() || node.next != node.getNextNode()) {
                return false;
            }
        }
    
        return true;
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        for (LinkedListNode n = node; n != node; n = n.next) {
            count++;
        }
        return count;
    }

    private int countCachedNodes(LinkedListNode node) {
        int count = 0;
        for (LinkedListNode n = node; n != null; n = n.next) {
            count++;
        }
        return count;
    }


}
