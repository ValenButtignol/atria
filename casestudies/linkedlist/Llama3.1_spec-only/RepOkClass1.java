public class RepOkClass1{
    public boolean repOK() {
        // Check if the list is not empty
        if (size() == 0) {
            // If the list is empty, the header node should be the only node in the list
            return header == header.getPrev() && header == header.getNext();
        } else {
            // If the list is not empty, check the following conditions
            // Check if the header node is the first and last element in the list
            if (header != header.getPrev() || header != header.getNext()) {
                return false;
            }
            
            // Check if all nodes in the list are linked correctly
            Node prev = header.getPrev();
            Node curr = header;
            for (int i = 0; i < size() - 1; i++) {
                if (curr == null || curr.getNext() != prev) {
                    return false;
                }
                prev = curr;
                curr = curr.getNext();
            }
            
            // Check if the last node is linked to the header node
            if (curr != header) {
                return false;
            }
            
            // Check if the list does not contain any null elements
            for (Node node = header; node != header; node = node.getNext()) {
                if (node.getElement() == null) {
                    return false;
                }
            }
            
            // If all checks pass, the representation invariant holds
            return true;
        }
    }


}
