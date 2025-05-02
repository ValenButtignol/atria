public class RepOkClass1{
    public boolean repOK_1() {
        if (header == null) return false;
        if (header.previous != header || header.next != header) return false;
        if (size < 0) return false;
        if (cacheSize < 0 || cacheSize > maximumCacheSize) return false;
        if (cacheSize != 0 && firstCachedNode == null) return false;
        
        LinkedListNode currentNode = header.next;
        while (currentNode != header) {
            if (currentNode.getValue() == null) return false;
            if (currentNode.previous == null) return false;
            if (currentNode.next == null) return false;
            currentNode = currentNode.next;
        }
        
        currentNode = firstCachedNode;
        while (currentNode != null) {
            if (currentNode.getValue() != null) return false;
            if (currentNode.previous != null) return false;
            currentNode = currentNode.next;
        }
        
        return true;
    }


}
