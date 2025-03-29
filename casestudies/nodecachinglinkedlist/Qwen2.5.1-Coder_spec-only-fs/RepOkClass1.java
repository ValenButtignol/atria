public class RepOkClass1{
    public boolean repOK() {
        if (header == null)
            return size == 0;
    
        if (size != numNodes())
            return false;
    
        if (!isDoublyLinked())
            return false;
    
        if (!cacheIsValid())
            return false;
    
        return true;
    }

    private int numNodes() {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }

    private boolean isDoublyLinked() {
        LinkedListNode current = header.next;
        while (current != header) {
            if (current.prev == null || current.next == null)
                return false;
            current = current.next;
        }
        return true;
    }

    private boolean cacheIsValid() {
        if (cacheSize > maximumCacheSize)
            return false;
    
        LinkedListNode current = firstCachedNode;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count == cacheSize;
    }

    private boolean isEqualValue(Object a, Object b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        return a.equals(b);
    }


}
