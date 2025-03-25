public class RepOkClass1{
    public boolean repOK() {
        // Check if the list is empty
        if (size == 0) {
            // Header's next should be null if the list is empty
            if (header.next != header) {
                return false;
            }
            return true;
        }
    
        // Check if the size matches the number of entries
        int expectedSize = 0;
        Entry current = header.next;
        while (current != header) {
            expectedSize++;
            current = current.next;
        }
        if (expectedSize != size) {
            return false;
        }
    
        // Check each node's previous and next pointers
        Entry current = header.next;
        while (current != header) {
            // Check previous pointer
            Entry prev = current.previous;
            if (prev == null) {
                return false;
            }
            // Check next pointer
            Entry next = current.next;
            if (next == null) {
                return false;
            }
            current = next;
        }
    
        // Check the header's previous pointer
        if (header.previous != null) {
            return false;
        }
    
        return true;
    }


}
