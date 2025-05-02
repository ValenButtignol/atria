public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the list is empty
        if (size() == 0) {
            Entry e = header.next;
            return e == header && e == header.previous;
        }
    
        // Check if the header's next and previous point to themselves
        Entry e = header.next;
        if (e != header || e != header.previous) {
            return false;
        }
    
        // Check each entry's next and previous pointers
        Entry current = header.next;
        while (current != header) {
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        // Check if the size matches the number of entries
        return size().equals(count());
    }


}
