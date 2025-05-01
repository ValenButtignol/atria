public class RepOkClass3 {
    public boolean property() {
        if (header == null) {
            return false;
        }
        
        LinkedListNode current = header.next;
        while (current != header) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
