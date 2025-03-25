public class RepOkClass1{
    public boolean repOK() {
        if (header.getPrevious() != header || header.getNext() != header) {
            return false;
        }
        if (size < 0) {
            return false;
        }
        if (cacheSize < 0 || cacheSize > maximumCacheSize) {
            return false;
        }
        if (firstCachedNode != null) {
            LinkedListNode current = firstCachedNode;
            int count = 0;
            while (current != null && count < cacheSize) {
                if (current.getValue() != null) {
                    return false;
                }
                current = current.getNext();
                count++;
            }
            if (current != null) {
                return false;
            }
        }
        return true;
    }


}
