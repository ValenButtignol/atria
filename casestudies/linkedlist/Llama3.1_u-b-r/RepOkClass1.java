public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header is correctly set
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if all entries are correctly linked
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.next != header || e.previous != e.previous.next) {
                return false;
            }
        }
    
        // Check if the size is correctly maintained
        if (size != countEntries()) {
            return false;
        }
    
        return true;
    }

    private int countEntries() {
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
        return count;
    }


}
