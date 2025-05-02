public class RepOkClass1{
    public boolean repOK_1() {
        if (header.next == header) {
            return size == 0;
        }
    
        Entry current = header.next;
        while (current != header) {
            if (current.next == null || current.next != current.previous.next) {
                return false;
            }
            if (current.previous == null || current.previous != current.next.previous) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


}
