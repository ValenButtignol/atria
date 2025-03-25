public class RepOkClass1{
    public boolean repOK() {
        if (header == null) {
            return false;
        }
        if (size < 0) {
            return false;
        }
        if (cacheSize < 0) {
            return false;
        }
        if (maximumCacheSize < 0) {
            return false;
        }
        if (maximumCacheSize < cacheSize) {
            return false;
        }
        if (firstCachedNode != null && (firstCachedNode.previous != header || firstCachedNode.next == header)) {
            return false;
        }
        LinkedListNode node = header;
        int count = 0;
        do {
            node = node.next;
            count++;
        } while (node != header);
        if (count != size) {
            return false;
        }
        return true;
    }


}
