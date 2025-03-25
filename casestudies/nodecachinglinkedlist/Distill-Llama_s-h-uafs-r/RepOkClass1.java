public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != numNodes(header)) {
            return false;
        }
    
        // Check if the cache is not full beyond its maximum size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the first cached node's next is not null and its previous is correctly set
        if (firstCachedNode != null) {
            if (firstCachedNode.next == null || firstCachedNode.previous == null) {
                return false;
            }
        }
    
        // Check if adding a node to the cache is done correctly
        if (firstCachedNode != null) {
            LinkedListNode nextCachedNode = firstCachedNode.next;
            if (nextCachedNode != null) {
                nextCachedNode.previous.next = firstCachedNode;
                nextCachedNode.previous = firstCachedNode;
            }
        }
    
        // Check if removing a node from the cache is done correctly
        if (firstCachedNode != null) {
            LinkedListNode cachedNode = firstCachedNode;
            cachedNode.next = null;
            firstCachedNode = cachedNode.next;
            cacheSize--;
        }
    
        return true;
    }

    private int numNodes(LinkedListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.previous) + numNodes(node.next);
    }


}
