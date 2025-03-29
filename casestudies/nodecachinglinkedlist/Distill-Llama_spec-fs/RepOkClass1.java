public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != (header.next != header ? 1 : 0) + (cacheSize)) {
            return false;
        }
    
        // Check if the cache is not over its maximum size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if all nodes have unique values
        Set<Object> seenValues = new HashSet<>();
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (seenValues.contains(node.getValue())) {
                return false;
            }
            seenValues.add(node.getValue());
        }
    
        // Check if the linked list is properly structured
        LinkedListNode current = header.next;
        while (current != header) {
            if (current.getPrevious() != header || current.getNext() != header.next) {
                return false;
            }
            current = current.getNext();
        }
    
        return true;
    }


}
