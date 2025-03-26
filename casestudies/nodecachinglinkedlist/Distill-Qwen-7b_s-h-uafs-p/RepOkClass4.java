public class RepOkClass4{
    public boolean property() {
        // Check if the header node is correctly set
        if (header.next == null && firstCachedNode != null) {
            throw new IllegalStateException("Header node is null while cache is non-empty");
        }
    
        // Check if the linked list is empty
        if (header.next == null) {
            return true; // An empty list is valid
        }
    
        // Check each node's previous and next pointers
        LinkedListNode current = header.next;
        while (current != null) {
            // Each node must have a non-null previous (except the head)
            if (current.previous == null && current != header.next) {
                throw new IllegalStateException("Node has null previous pointer");
            }
    
            // Each node must have a non-null next (except the tail)
            if (current.next == null && current != header.next) {
                throw new IllegalStateException("Node has null next pointer");
            }
    
            // The next node's previous must point back to this node
            if (current.next != null && current.next.previous != current) {
                throw new IllegalStateException("Next node's previous does not point to current node");
            }
    
            current = current.next;
        }
    
        // Check cache consistency
        if (cacheSize > maximumCacheSize) {
            throw new IllegalStateException("Cache is full");
        }
    
        return true;
    }


}
