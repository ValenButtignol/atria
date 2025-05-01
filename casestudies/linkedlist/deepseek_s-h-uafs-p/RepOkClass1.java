public class RepOkClass1 {
    public boolean property() {
        if (header.next == null || header.previous == null) {
            return false;
        }
        if (size == 0) {
            return header.next == header && header.previous == header;
        }
        Entry current = header.next;
        while (current != header) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
