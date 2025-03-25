public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        Entry current = header.next;
        int count = 0;
    
        while (current != header) {
            count++;
            current = current.next;
        }
    
        if (count != size) {
            return false;
        }
    
        current = header;
        while (current.next != header) {
            if (current.next.previous != current) {
                return false;
            }
            current = current.next;
        }
    
        current = header;
        while (current.previous != header) {
            if (current.previous.next != current) {
                return false;
            }
            current = current.previous;
        }
    
        return true;
    }


}
