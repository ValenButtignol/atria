public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the list is empty
        if (header.next == header && header.previous == header) {
            // Header points to itself, list is empty
            if (size != 0) {
                return false;
            }
        } else {
            // List is not empty, check the integrity of the linked list
            Node current = header.next;
            while (current != header) {
                if (current.next == null || current.previous == null) {
                    return false;
                }
                current = current.next;
            }
        }
    
        // Check if the size matches the number of nodes
        if (size != countNodes()) {
            return false;
        }
    
        return true;
    }

    private int countNodes() {
        Node current = header.next;
        int count = 0;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }


}
