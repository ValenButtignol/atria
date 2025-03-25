public class RepOkClass1{
    public boolean repOK() {
        int expectedSize = size;
        Entry current = header.next;
        int actualSize = 0;
    
        while (current != header) {
            actualSize++;
            if (current.previous == null || current.previous != header) {
                return false;
            }
            if (current.next == null) {
                if (current != header) {
                    return false;
                }
            } else if (current.next != current.next.next) {
                return false;
            }
            current = current.next;
        }
    
        if (actualSize != expectedSize) {
            return false;
        }
    
        return true;
    }


}
