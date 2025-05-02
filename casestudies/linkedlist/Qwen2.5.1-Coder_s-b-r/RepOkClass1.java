public class RepOkClass1{
        public boolean repOK_1() {
            // Check if the header is not null
            if (header == null) {
                return false;
            }
    
            // Check if the header's next and previous pointers point to itself
            if (header.next != header || header.previous != header) {
                return false;
            }
    
            // Check if the size is non-negative
            if (size < 0) {
                return false;
            }
    
            // Check if the size is consistent with the number of entries
            int count = 0;
            for (Entry e = header.next; e != header; e = e.next) {
                count++;
            }
            if (count != size) {
                return false;
            }
    
            // Check if all entries have valid next and previous pointers
            for (Entry e = header.next; e != header; e = e.next) {
                if (e.next == null || e.previous == null) {
                    return false;
                }
            }
    
            // Check if the header's next and previous pointers are consistent
            if (header.next.previous != header || header.previous.next != header) {
                return false;
            }
    
            return true;
        }


}
