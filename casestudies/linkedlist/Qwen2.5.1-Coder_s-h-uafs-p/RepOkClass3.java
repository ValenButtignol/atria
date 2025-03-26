public class RepOkClass3{
    public boolean property() {
        if (header.next == header || header.previous == header) {
            return false;
        }
        Entry current = header.next;
        while (current != header) {
            if (current.next == header || current.previous == header) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
