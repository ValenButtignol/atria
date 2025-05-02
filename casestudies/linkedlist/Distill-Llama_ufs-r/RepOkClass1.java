public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header's next is itself, which would mean an empty list
        if (header.next == header) {
            if (size != 0) {
                return false;
            }
            // Else, it's empty, proceed
        } else {
            // Check if the header's next is not the header
            if (header.next == header) {
                return false;
            }
        }
    
        // Now, traverse the list to check for cycles and duplicates
        Set<Node> visited = new HashSet<>();
        Node current = header.next;
        int count = 0;
        while (current != header) {
            // Check if current node is already visited → cycle or duplicate
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            count++;
            current = current.next;
        }
    
        // Check if the count matches the size
        if (count != size) {
            return false;
        }
    
        return true;
    }


}
