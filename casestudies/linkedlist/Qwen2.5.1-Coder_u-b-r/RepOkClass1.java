public class RepOkClass1{
    public boolean repOK() {
        // Check if the header is correctly linked to itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if the size is consistent with the number of elements
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
        if (count != size) {
            return false;
        }
    
        // Check if each node has its next and previous pointers correctly set
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.previous.next != e || e.next.previous != e) {
                return false;
            }
        }
    
        return true;
    }


}
