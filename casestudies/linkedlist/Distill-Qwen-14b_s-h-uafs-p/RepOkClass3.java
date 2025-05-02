public class RepOkClass3{
    public boolean property_3() {
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
