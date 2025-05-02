public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the size matches the number of nodes in the linked list
        if (size != countNodes(header)) {
            return false;
        }
    
        // Check that cacheSize does not exceed maximumCacheSize
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Check that firstCachedNode is null or points to a valid cached node
        if (firstCachedNode != null) {
            LinkedListNode cachedNode = firstCachedNode;
            if (cachedNode.previous != header || cachedNode.next == null) {
                return false;
            }
            // Ensure the cached node is part of the main linked list
            if (!isNodeInList(cachedNode)) {
                return false;
            }
        }
    
        // Check that cacheSize is non-negative
        if (cacheSize < 0) {
            return false;
        }
    
        return true;
    }

    private int countNodes(LinkedListNode header) {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }

    private boolean isNodeInList(LinkedListNode node) {
        LinkedListNode current = header.next;
        while (current != header) {
            if (isEqualValue(node.getValue(), current.getValue())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


}
