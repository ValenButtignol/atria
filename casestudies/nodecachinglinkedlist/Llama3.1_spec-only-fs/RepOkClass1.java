public class RepOkClass1{
    public boolean repOK() {
        // Check if the size attribute is consistent with the number of nodes in the list
        if (size != countNodes(header)) {
            return false;
        }
    
        // Check if the cache size is less than or equal to the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if the cache is consistent with the list
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (!containsNode(current)) {
                return false;
            }
            current = current.nextCachedNode;
        }
    
        // Check if the list does not contain duplicate values
        if (hasDuplicates(header)) {
            return false;
        }
    
        return true;
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.nextNode;
        }
        return count;
    }

    private boolean containsNode(LinkedListNode node) {
        LinkedListNode current = header;
        while (current != null) {
            if (current == node) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    private boolean hasDuplicates(LinkedListNode node) {
        Set<Object> values = new HashSet<>();
        while (node != null) {
            if (!values.add(node.value)) {
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }


}
