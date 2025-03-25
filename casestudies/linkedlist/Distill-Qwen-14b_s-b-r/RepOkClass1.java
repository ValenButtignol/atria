public class RepOkClass1{
    public boolean repOK() {
        // Check that header's next and previous are itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // If the list is empty, size should be 0 and header.next should be header
        if (size == 0) {
            return header.next == header;
        }
    
        // Check the links of each entry and count the nodes
        int count = 0;
        Entry e = header.next;
        while (e != header) {
            if (e.next.previous != e || e.previous.next != e) {
                return false;
            }
            count++;
            e = e.next;
        }
    
        // Ensure the count matches the size
        return count == size;
    }


}
