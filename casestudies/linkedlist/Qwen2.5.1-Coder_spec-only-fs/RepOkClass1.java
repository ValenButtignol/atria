public class RepOkClass1{
        public boolean repOK() {
            // Check if size is consistent
            int count = 0;
            Entry current = header.next;
            while (current != header) {
                count++;
                current = current.next;
            }
            if (count != size) {
                return false;
            }
    
            // Check for null elements (except header)
            current = header.next;
            while (current != header) {
                if (current.element == null) {
                    return false;
                }
                current = current.next;
            }
    
            // Check for circular references
            if (header.prev != header || header.next != header) {
                return false;
            }
    
            // Check doubly linked structure
            current = header.next;
            while (current != header) {
                if (current.prev == null || current.next == null) {
                    return false;
                }
                current = current.next;
            }
    
            return true;
        }


}
