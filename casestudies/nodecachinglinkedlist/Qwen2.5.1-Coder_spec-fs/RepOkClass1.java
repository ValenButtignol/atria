public class RepOkClass1{
    public boolean repOK() {
        if (header == null)
            return false;
    
        if (size < 0)
            return false;
    
        if (cacheSize < 0)
            return false;
    
        if (cacheSize > maximumCacheSize)
            return false;
    
        if (!isDoublyLinkedList())
            return false;
    
        if (!isConsistentSize())
            return false;
    
        if (!isCacheConsistent())
            return false;
    
        return true;
    }

    private boolean isDoublyLinkedList() {
        LinkedListNode current = header;
        int count = 0;
        do {
            if (current.next == null || current.previous == null)
                return false;
            current = current.next;
            count++;
        } while (current != header);
        return count == size;
    }

    private boolean isConsistentSize() {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count == size;
    }

    private boolean isCacheConsistent() {
        LinkedListNode current = firstCachedNode;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count == cacheSize;
    }


}
