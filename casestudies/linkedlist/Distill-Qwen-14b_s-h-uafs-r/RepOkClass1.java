public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the header's next and previous point to itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check that the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check the integrity of all entries
        Entry current = header.next;
        int count = 0;
        while (current != header) {
            // Check that next and previous pointers are consistent
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            count++;
            current = current.next;
        }
    
        // Check that the size matches the count of entries
        if (count != size) {
            return false;
        }
    
        return true;
    }


}
