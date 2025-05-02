public class RepOkClass1{
    public boolean repOK_1() {
        if (header == null && size != 0) {
            return false;
        }
    
        int actualSize = 0;
        Entry current = header.next;
        do {
            actualSize++;
            current = current.next;
        } while (current != null);
    
        if (actualSize != size) {
            return false;
        }
    
        Entry current = header.next;
        while (current != null) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        if (header.previous != null) {
            return false;
        }
    
        if (size > 0 && header.next == null) {
            return false;
        }
    
        Entry last = null;
        current = header.next;
        while (current != null) {
            last = current;
            current = current.next;
        }
        if (last != null) {
            if (last.next != null) {
                return false;
            }
            if (size > 0 && last.previous == null) {
                return false;
            }
        }
    
        return true;
    }


}
