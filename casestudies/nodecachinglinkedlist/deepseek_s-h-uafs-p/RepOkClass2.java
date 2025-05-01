public class RepOkClass2 {
    public boolean property() {
        int count = 0;
        LinkedListNode current = firstCachedNode;
        while (current != null) {
            if (current.getValue() != null) {
                return false;
            }
            count++;
            current = current.next;
        }
        return count == cacheSize;
    }
}
