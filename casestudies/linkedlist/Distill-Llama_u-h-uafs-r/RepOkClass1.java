public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != 0) {
            // Traverse the list to check structure and consistency
            for (Entry e = header.next; e != header; e = e.next) {
                // Check if the next and previous pointers are correctly set
                if (e.next != header.next || e.previous != e.previous) {
                    return false;
                }
            }
        } else {
            // Check if the header is correctly set up
            if (header.next != header || header.previous != header) {
                return false;
            }
        }
        return true;
    }


}
