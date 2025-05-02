public class RepOkClass4{
    public boolean property_4() {
        Entry current = header.next;
        while (current != header) {
            if (current.element == null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
