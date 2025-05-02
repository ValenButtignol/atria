public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is 0
        if (size == 0) {
            return (header.next == header && header.previous == header);
        }
    
        // Check if the list is effectively empty but size is not 0
        if (header.next == header) {
            return false;
        }
    
        // Check that the last node's next is header
        Entry last = header.next;
        while (last != header) {
            if (last.next == null) {
                return false;
            }
            last = last.next;
        }
    
        // Check each node's next and previous pointers
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.next == null || e.previous == null) {
                return false;
            }
            if (e.previous.next != e) {
                return false;
            }
        }
    
        return true;
    }


}
