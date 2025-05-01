public class RepOkClass4 {
    public boolean property() {
        if (header.next == null || header.previous == null) {
            return false;
        }
        Entry current = header.next;
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
