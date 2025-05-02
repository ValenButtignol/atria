public class RepOkClass1{
    public boolean repOK_1() {
        // The header node is the first node in the list
        if (header.next != header) {
            return false;
        }
    
        // The list size is equal to the number of nodes in the list
        if (size != countNodes(header)) {
            return false;
        }
    
        // The cache size is equal to the number of nodes in the cache
        if (cacheSize != countCachedNodes(firstCachedNode)) {
            return false;
        }
    
        // The cache is a doubly linked list
        if (!isDoublyLinkedList(firstCachedNode)) {
            return false;
        }
    
        // The list is a doubly linked list
        if (!isDoublyLinkedList(header)) {
            return false;
        }
    
        // The cache size is limited to the maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // The list size is updated when a node is added or removed
        if (size != countNodes(header) + countCachedNodes(firstCachedNode)) {
            return false;
        }
    
        // The cache size is updated when a node is added or removed from the cache
        if (cacheSize != countCachedNodes(firstCachedNode) + (size - countNodes(header))) {
            return false;
        }
    
        return true;
    }

    private int countNodes(LinkedListNode node) {
        int count = 0;
        for (LinkedListNode currentNode = node.next; currentNode != node; currentNode = currentNode.next) {
            count++;
        }
        return count;
    }

    private int countCachedNodes(LinkedListNode node) {
        int count = 0;
        for (LinkedListNode currentNode = node; currentNode != null; currentNode = currentNode.next) {
            count++;
        }
        return count;
    }

    private boolean isDoublyLinkedList(LinkedListNode node) {
        for (LinkedListNode currentNode = node; currentNode != null; currentNode = currentNode.next) {
            if (currentNode.previous != currentNode.next) {
                return false;
            }
        }
        return true;
    }


}
