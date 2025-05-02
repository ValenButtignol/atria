public class RepOkClass1{
    public boolean repOK_1() {
        if (header == null)
            return false;
    
        if (size < 0)
            return false;
    
        if (cacheSize < 0)
            return false;
    
        if (maximumCacheSize < 0)
            return false;
    
        if (cacheSize > maximumCacheSize)
            return false;
    
        if (firstCachedNode != null && !isNodeInList(firstCachedNode))
            return false;
    
        if (!isListConsistent())
            return false;
    
        return true;
    }

    private boolean isNodeInList(LinkedListNode node) {
        for (LinkedListNode current = header.next; current != header; current = current.next) {
            if (current == node)
                return true;
        }
        return false;
    }

    private boolean isListConsistent() {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            if (current.previous == null || current.next == null)
                return false;
            current = current.next;
        }
        return count == size;
    }


}
