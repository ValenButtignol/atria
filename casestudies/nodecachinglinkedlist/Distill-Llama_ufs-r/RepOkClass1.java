public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the cache size does not exceed the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check that the linked list does not contain any nodes whose values are present in the cache
        Set<Object> cacheValues = new HashSet<>();
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            cacheValues.add(current.getValue());
            current = current.next;
        }
    
        for (int i = 0; i < size; i++) {
            Object value = header.next(i).getValue();
            if (cacheValues.contains(value)) {
                return false;
            }
        }
    
        return true;
    }


}
