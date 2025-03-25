public class RepOkClass1{
    public boolean repOK() {
        // Check if the header's next and previous are itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Count the number of entries starting from header.next
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
    
        // Check if the count matches the size and size is non-negative
        if (count != size || size < 0) {
            return false;
        }
    
        return true;
    }


}
