public class RepOkClass1{
    public boolean repOK() {
        // Check if the header's next is the header, indicating an empty list.
        if (header.next != header) {
            // Traverse the list to ensure all nodes are doubly linked.
            Node current = header.next;
            Node previous = header;
            while (current != null) {
                // Check if any node has a null next or previous, indicating a broken link.
                if (current.next == null || previous == null) {
                    return false;
                }
                previous = current.previous;
                current = current.next;
            }
        }
        // Check if the size matches the actual number of nodes.
        if (size != (header.next == null ? 0 : countNodes(header.next))) {
            return false;
        }
        return true;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.next);
    }


}
