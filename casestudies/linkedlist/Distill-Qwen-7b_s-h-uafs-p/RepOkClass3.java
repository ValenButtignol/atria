public class RepOkClass3{
    public boolean property_3() {
        Entry current = header.next;
        while (current != header && current.next != null) {
            current = current.next;
        }
        if (current != header) {
            return false;
        }
        return true;
    }


}
