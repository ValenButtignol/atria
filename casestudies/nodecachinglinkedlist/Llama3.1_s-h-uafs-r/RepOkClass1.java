public class RepOkClass1{
    public boolean repOK() {
        if (header.next == header) {
            return size == 0;
        }
    
        LinkedListNode current = header.next;
        while (current != header) {
            if (current.next == null || current.next != current.previous) {
                return false;
            }
            current = current.next;
        }
    
        if (firstCachedNode != null) {
            LinkedListNode currentCached = firstCachedNode;
            while (currentCached != null) {
                if (currentCached.next == null || currentCached.next != currentCached.previous) {
                    return false;
                }
                currentCached = currentCached.next;
            }
        }
    
        return true;
    }


}
