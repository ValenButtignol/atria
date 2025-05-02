public class RepOkClass1{
    public boolean repOK_1() {
        // Check header's previous and next pointers
        if (header.previous != header || header.next != header) {
            return false;
        }
    
        // Check size consistency by traversing the main list
        int actualSize = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check cache size constraints
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check main list structure and node values
        current = header.next;
        while (current != header) {
            if (current.previous == null || current.next == null) {
                return false;
            }
            if (current.value == null) {
                return false; // Active nodes should have non-null values
            }
            current = current.next;
        }
    
        // Check cache structure if cache is not empty
        if (cacheSize > 0) {
            LinkedListNode cacheCurrent = firstCachedNode;
            Set<LinkedListNode> cacheNodes = new HashSet<>();
            while (cacheCurrent != null) {
                cacheNodes.add(cacheCurrent);
                if (cacheCurrent.next == null) {
                    return false; // Cache should form a proper linked list
                }
                cacheCurrent = cacheCurrent.next;
            }
            if (cacheNodes.size() != cacheSize) {
                return false;
            }
    
            // Check all cache nodes have null values
            for (LinkedListNode node : cacheNodes) {
                if (node.value != null) {
                    return false;
                }
            }
    
            // Check that cache nodes are not in the main list
            Set<LinkedListNode> mainNodes = new HashSet<>();
            current = header.next;
            while (current != header) {
                mainNodes.add(current);
                current = current.next;
            }
            for (LinkedListNode node : cacheNodes) {
                if (mainNodes.contains(node)) {
                    return false;
                }
            }
        }
    
        return true;
    }


}
