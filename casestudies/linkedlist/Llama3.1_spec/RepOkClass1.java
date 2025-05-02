public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the list is empty
        if (size == 0) {
            return header.next == header && header.previous == header;
        }
    
        // Check if the list has at least one element
        Entry first = header.next;
        Entry last = header.previous;
        if (first == header || last == header) {
            return false;
        }
    
        // Check if the list is circularly linked
        if (first.next != last || last.previous != first) {
            return false;
        }
    
        // Check if all elements are non-null
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element == null) {
                return false;
            }
        }
    
        // Check if the size is correct
        return size == countElements();
    }

    private int countElements() {
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
        return count;
    }


}
