public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header's next is the first node
        if (!Objects.equals(header.next, firstCachedNode)) {
            return false;
        }
    
        // Check if the size matches the actual number of nodes
        int actualSize = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            actualSize++;
            current = current.next;
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check if the cache size exceeds the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check if all nodes are properly linked
        LinkedListNode firstNode = header.next;
        if (firstNode == null) {
            // The list is empty, which is allowed
            return true;
        }
    
        // Check the links for the first node
        if (!Objects.equals(firstNode.getPreviousNode(), header) ||
            !Objects.equals(firstNode.getNextNode(), header.next)) {
            return false;
        }
    
        // Check the links for the last node
        LinkedListNode lastNode = header.getPreviousNode();
        if (lastNode != null) {
            if (!Objects.equals(lastNode.getNextNode(), header) ||
                !Objects.equals(lastNode.getPreviousNode(), header)) {
                return false;
            }
        }
    
        // Check the links for all intermediate nodes
        current = firstNode.next;
        while (current != header) {
            if (!Objects.equals(current.getPreviousNode(), current.previous) ||
                !Objects.equals(current.getNextNode(), current.next)) {
                return false;
            }
            current = current.next;
        }
    
        return true;
    }


}
