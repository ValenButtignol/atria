public class RepOkClass5{
    public boolean property_5() {
        Entry current = header.next;
        for (int i = 0; i < size; i++) {
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
