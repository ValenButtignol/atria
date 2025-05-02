public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the list is empty
        if (header.next == null && size == 0) {
            return true;
        }
    
        // Check if the header's previous is null (dummy node)
        if (header.previous != null) {
            return false;
        }
    
        // Check each node's previous and next pointers
        Entry current = header.next;
        while (current != null) {
            if (current.previous == null || current.next == null) {
                return false;
            }
            current = current.next;
        }
    
        // Check if the last node's next is null
        if (current.next != null) {
            return false;
        }
    
        return true;
    }


}
