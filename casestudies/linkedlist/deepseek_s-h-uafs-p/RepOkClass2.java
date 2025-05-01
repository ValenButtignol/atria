public class RepOkClass2 {
    public boolean property() {
        Entry current = header.next;
        while (current != header) {
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
