public class RepOkClass1{
    public boolean repOK() {
        if (size == 0) {
            // Check if the list is empty and header forms a cycle with itself
            return (header.next == header) && (header.previous == header) && (header.next.next == header);
        }
    
        // Check if header's next and previous are not pointing to itself (non-empty list)
        if (header.next == header || header.previous == header) {
            return false;
        }
    
        // Traverse the list to count nodes and check for null pointers
        Entry current = header.next;
        int count = 0;
        while (current != header) {
            count++;
            // Ensure next and previous are not null for any node except header
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        // Verify the count matches the size
        if (count != size) {
            return false;
        }
    
        // Check that the last node's next is header and the first node's previous is header
        Entry lastNode = header.previous;
        Entry firstNode = header.next;
        if (lastNode.next != header || firstNode.previous != header) {
            return false;
        }
    
        return true;
    }


}
