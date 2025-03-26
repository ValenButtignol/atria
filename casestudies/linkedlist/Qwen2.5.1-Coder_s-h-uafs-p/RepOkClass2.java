public class RepOkClass2{
    public boolean property() {
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
