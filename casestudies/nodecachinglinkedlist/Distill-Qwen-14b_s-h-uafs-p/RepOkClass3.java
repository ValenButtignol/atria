public class RepOkClass3{
    public boolean property_3() {
        Set<LinkedListNode> visited = new HashSet<>();
        LinkedListNode current = header.next;
        visited.add(header);
        
        while (current != header) {
            if (visited.contains(current)) {
                return false; // Detected a cycle
            }
            visited.add(current);
            
            // Check previous and next pointers
            if (current.previous.next != current) {
                return false;
            }
            if (current.next != null && current.next.previous != current) {
                return false;
            }
            
            current = current.next;
        }
        
        return true;
    }


}
