public class RepOkClass1{
    public boolean repOK_1() {
        if (header == null) {
            return false;
        }
        if (size < 0) {
            return false;
        }
        if (size == 0) {
            return (header.next == header) && (header.previous == header);
        }
        if (header.next == header || header.previous == header) {
            return false;
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
