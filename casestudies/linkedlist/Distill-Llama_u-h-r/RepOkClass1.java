public class RepOkClass1{
    public boolean repOK() {
        // Check if the header's next and previous are itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Count the number of valid entries
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element != null) {
                count++;
            }
        }
    
        // Check if the size matches the count of valid entries
        if (size != count) {
            return false;
        }
    
        // Check each entry's next and previous pointers
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.previous == null || e.next == null) {
                return false;
            }
        }
    
        return true;
    }


}
