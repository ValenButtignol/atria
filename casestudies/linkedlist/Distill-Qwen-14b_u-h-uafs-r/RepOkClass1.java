public class RepOkClass1{
    public boolean repOK() {
        // Check header's next and previous point to itself
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check that for every entry, next.previous == current and previous.next == current
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.next.previous != e || e.previous.next != e) {
                return false;
            }
        }
    
        // Check that size is correct
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
        if (count != size) {
            return false;
        }
    
        return true;
    }


}
