public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header is not null
        if (header == null) {
            return false;
        }
    
        // Check if the header's next and previous references are consistent
        if (header.next == null || header.previous == null) {
            return false;
        }
    
        // Check if the header's next and previous references point to each other
        if (header.next.previous != header || header.previous.next != header) {
            return false;
        }
    
        // Check the size of the list
        int actualSize = 0;
        Entry current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
    
        if (actualSize != size) {
            return false;
        }
    
        // Check if all entries are properly linked
        current = header.next;
        while (current != header) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
