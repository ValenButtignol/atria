public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header's next and previous are itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Traverse the list and count the nodes
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            // Ensure each node has non-null next and previous
            if (e.next == null || e.previous == null) {
                return false;
            }
            count++;
        }
    
        // Ensure the count matches the size
        return count == size;
    }


}
