public class RepOkClass1{
    public boolean repOK() {
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        if (firstCachedNode == null && !isEmpty()) {
            return false;
        }
        if (size != (firstCachedNode != null ? numCachedNodes() : 0)) {
            return false;
        }
        if (!isValidStructure()) {
            return false;
        }
        return true;
    }

    private boolean isValidStructure() {
        LinkedListNode current = header.next;
        int expectedSize = size;
        while (current != header) {
            if (current.previous == null && current.next != null) {
                return false;
            }
            if (current.next == null && current.previous != null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    private int numCachedNodes() {
        LinkedListNode current = firstCachedNode;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != null);
        return count;
    }


}
