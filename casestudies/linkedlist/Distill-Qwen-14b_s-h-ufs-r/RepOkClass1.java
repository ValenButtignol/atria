public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return (header.next == header) && (header.previous == header);
        }
    
        Entry current = header.next;
        int count = 0;
        while (current != header) {
            count++;
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        if (count != size) {
            return false;
        }
    
        Entry last = header.previous;
        if (last.next != header || header.previous != last) {
            return false;
        }
    
        if (header.next == header || header.next == null) {
            return false;
        }
    
        return true;
    }


}
