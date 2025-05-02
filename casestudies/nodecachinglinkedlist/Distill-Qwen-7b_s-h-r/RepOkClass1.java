public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the cache size does not exceed the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        // Check that the first cached node is valid if the cache is not empty
        if (firstCachedNode != null) {
            if (firstCachedNode.getValue() == null) {
                return false;
            }
        }
        // Check that the size of the linked list is correct
        int expectedSize = size;
        // Traverse the linked list to count the actual number of nodes
        int actualSize = 0;
        NodeCachingLinkedList current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        if (actualSize != expectedSize) {
            return false;
        }
        return true;
    }


}
