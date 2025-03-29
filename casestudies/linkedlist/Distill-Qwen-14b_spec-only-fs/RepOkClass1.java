public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is consistent with the list structure
        if (size != 0) {
            // The first node should be the one after the header
            Entry first = header.next;
            Entry last = header.previous;
    
            // Check if the first and last nodes are correctly linked
            if (first == null || last == null || first != last) {
                return false;
            }
    
            // Check the size consistency
            if (size != numNodes()) {
                return false;
            }
    
            // Check for cycles
            if (hasCycle()) {
                return false;
            }
    
            // Check the order of elements
            if (!isOrderMaintained()) {
                return false;
            }
        } else {
            // If the list is empty, ensure the header points to itself
            if (header.next != header || header.previous != header) {
                return false;
            }
        }
    
        return true;
    }

    private int numNodes() {
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }

    private boolean hasCycle() {
        Entry slow = header.next;
        Entry fast = header.next.next;
        while (fast != header && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast == slow && slow != header;
    }

    private boolean isOrderMaintained() {
        Entry current = header.next;
        while (current.next != header) {
            Entry next = current.next;
            if (current.element == null || next.element == null) {
                // Handle null elements if necessary
                continue;
            }
            if (!(current.element <= next.element)) {
                return false;
            }
            current = next;
        }
        return true;
    }


}
