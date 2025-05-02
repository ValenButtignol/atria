public class RepOkClass4{
    public boolean property_4() {
        // Check if the header's next is itself, which would indicate a cycle.
        if (header.next == header) {
            return false;
        }
    
        // Find the last node in the list.
        Entry last = header;
        while (last.next != null) {
            last = last.next;
        }
    
        // Check if the last node's next points back to the header.
        if (last.next != header) {
            return false;
        }
    
        // Now, traverse the list to check for any cycles.
        Set visited = new HashSet();
        Entry current = header.next;
        while (current != header) {
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            current = current.next;
        }
    
        return true;
    }


}
