public class RepOkClass5{
    public boolean property() {
        if (firstCachedNode == null) {
            return true;
        }
        LinkedListNode current = header.next;
        while (current != header) {
            if (current == firstCachedNode) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
