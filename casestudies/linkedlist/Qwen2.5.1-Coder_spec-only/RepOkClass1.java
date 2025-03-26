public class RepOkClass1{
    public boolean repOK() {
        // Check if the header is not null
        if (header == null) {
            return false;
        }
    
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the size is zero, then the header should point to itself
        if (size == 0) {
            return header.next == header && header.previous == header;
        }
    
        // Check if the size is greater than zero, then the header should not point to itself
        if (size > 0) {
            if (header.next == header || header.previous == header) {
                return false;
            }
        }
    
        // Check the integrity of the doubly linked list
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            if (current.next == null || current.previous == null) {
                return false;
            }
            current = current.next;
        }
    
        // Check if the count matches the size
        return count == size;
    }

    private static class Entry {
        Object element;
        Entry next;
        Entry previous;
    
        Entry(Object element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }


}
