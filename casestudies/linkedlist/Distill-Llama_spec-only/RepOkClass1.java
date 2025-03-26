public class RepOkClass1{
        public boolean repOK() {
            // Check if header's next and previous are itself
            if (header.next != header || header.previous != header) {
                return false;
            }
    
            // Check if any node (except header) has self-reference
            for (Entry e = header.next; e != null; e = e.next) {
                if (e.next == e || e.previous == e) {
                    return false;
                }
            }
    
            // Check size consistency
            if (size < 0) {
                return false;
            }
    
            return true;
        }


}
