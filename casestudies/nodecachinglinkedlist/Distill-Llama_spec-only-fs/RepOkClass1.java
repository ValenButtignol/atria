public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header is not null and the size is correct
        if (header == null && size != 0) {
            return false;
        }
        if (header != null && size < 0) {
            return false;
        }
    
        // Check if the cache is not over its maximum size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the firstCachedNode is correctly set
        if (firstCachedNode != null && !isCachedNode(firstCachedNode)) {
            return false;
        }
    
        // Check if all nodes in the cache are unique
        Set<Object> seenValues = new HashSet<>();
        for (LinkedListNode node = firstCachedNode; node != null; node = node.getNextCachedNode()) {
            if (seenValues.contains(node.getValue())) {
                return false;
            }
            seenValues.add(node.getValue());
        }
    
        // Check if the linked list structure is valid
        LinkedListNode current = header;
        while (current != null) {
            if (current.getPrevious() != null && current.getPrevious() != current) {
                return false;
            }
            if (current.getNext() != null && current != current.getNext()) {
                return false;
            }
            current = current.getNext();
        }
    
        return true;
    }

    private boolean isCachedNode(LinkedListNode node) {
        return node == firstCachedNode || isCachedNode(node.getNextCachedNode());
    }


}
