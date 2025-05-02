public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header's next and previous are itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Traverse the list and check each node's next and previous
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
    
            // Check previous
            if (e.previous == null || e.previous != e.prev) {
                return false;
            }
    
            // Check next
            if (e.next == null || e.next != e.nextNode) {
                return false;
            }
        }
    
        // Check size
        return count == size;
    }


}
