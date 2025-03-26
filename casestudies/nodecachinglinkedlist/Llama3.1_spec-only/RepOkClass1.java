public class RepOkClass1{
    public boolean repOK() {
        // Check if the list size is correct
        if (size != countNodes(header)) {
            return false;
        }
    
        // Check if the cache size is correct
        if (cacheSize != countNodes(firstCachedNode)) {
            return false;
        }
    
        // Check if the cache is not full
        if (isCacheFull() && cacheSize != maximumCacheSize) {
            return false;
        }
    
        // Check if the cache is not empty
        if (cacheSize == 0 && firstCachedNode != null) {
            return false;
        }
    
        // Check if the cache is not larger than the list
        if (cacheSize > size) {
            return false;
        }
    
        // Check if the maximum cache size is not exceeded
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the first cached node is the first node in the list
        if (firstCachedNode != null && firstCachedNode != header) {
            return false;
        }
    
        // Check if the last cached node is the last node in the list
        if (lastCachedNode() != null && lastCachedNode() != lastNode(header)) {
            return false;
        }
    
        return true;
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    private LinkedListNode lastNode(LinkedListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private LinkedListNode lastCachedNode() {
        LinkedListNode node = firstCachedNode;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }


}
