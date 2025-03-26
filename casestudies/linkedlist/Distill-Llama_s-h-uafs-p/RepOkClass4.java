public class RepOkClass4{
    public boolean property() {
        if (size == 0) {
            return true;
        }
        Entry current = header.next;
        while (current != header) {
            if (current.previous == null || current.next == null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
