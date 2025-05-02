public class RepOkClass1{
    public boolean repOK_1() {
        if (header.next == header) {
            return size == 0;
        }
    
        Entry current = header.next;
        while (current != header) {
            if (current.next == current || current.previous == current) {
                return false;
            }
            current = current.next;
        }
    
        current = header;
        while (current != header) {
            if (current.element == null) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
