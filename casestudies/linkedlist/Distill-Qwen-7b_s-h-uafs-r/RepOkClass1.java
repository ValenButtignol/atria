public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header points to itself (indicating a circular list)
        if (header.next != header || header.previous != header) {
            return false;
        }
    
        // Check if the size matches the number of entries in the list
        int actualSize = 0;
        Entry current = header.next;
        do {
            if (current != header) {
                actualSize++;
            }
            current = current.next;
        } while (current != header);
    
        if (actualSize != size) {
            return false;
        }
    
        // Check if each entry has valid next and previous pointers
        Entry current = header.next;
        while (current != header) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
