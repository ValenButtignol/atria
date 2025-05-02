public class RepOkClass1{
    public boolean repOK_1() {
        // Check that header's next and previous point to itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check that size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check that the number of nodes equals size
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            // Check that next and previous are not null
            if (current.next == null || current.previous == null) {
                return false;
            }
            // Check that next's previous is current and previous's next is current
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
    
        // Ensure the count matches the size
        if (count != size) {
            return false;
        }
    
        return true;
    }


}
