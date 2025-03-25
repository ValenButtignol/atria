public class RepOkClass1{
    public boolean repOK() {
        // Check if the list is empty
        if (size == 0) {
            return (header.next == header) && (header.previous == header);
        }
    
        // Check that header's next and previous are not pointing to itself (list is not empty)
        if (header.next == header || header.previous == header) {
            return false;
        }
    
        // Calculate the actual size by traversing the list
        int actualSize = 0;
        Entry current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
    
        // Check if the calculated size matches the stored size
        if (actualSize != size) {
            return false;
        }
    
        // Check the integrity of each node's links
        current = header.next;
        while (current != header) {
            // Check that the previous node points back correctly
            if (current.previous.next != current) {
                return false;
            }
            // Check that the next node's previous points back correctly
            if (current.next == null || current.next.previous != current) {
                return false;
            }
            current = current.next;
        }
    
        // Ensure the last node's next is the header
        Entry lastNode = header.previous;
        if (lastNode.next != header) {
            return false;
        }
    
        return true;
    }


}
