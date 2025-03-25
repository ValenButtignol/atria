public class RepOkClass1{
        public boolean repOK() {
            // Check size is non-negative
            if (size < 0) {
                return false;
            }
    
            // Check cache size is within bounds
            if (cacheSize < 0 || cacheSize > maximumCacheSize) {
                return false;
            }
    
            // Check header's next is the first node in the linked list
            LinkedListNode header = getHeader();
            LinkedListNode firstNode = getNodeFromCache();
            if (header == null) {
                return false;
            }
            if (firstNode == null) {
                return true; // Cache is empty
            }
            if (header.next != firstNode) {
                return false;
            }
    
            // Check first node in cache is valid
            LinkedListNode firstCachedNode = firstCachedNode();
            if (firstCachedNode != null && firstCachedNode.getValue() == null) {
                return false;
            }
    
            // Check linked list is properly formed
            LinkedListNode current = header.next;
            while (current != header) {
                if (current.previous == null || current.next == null) {
                    return false;
                }
                current = current.next;
            }
    
            return true;
        }

        private LinkedListNode getHeader() {
            return header;
        }

        private LinkedListNode firstCachedNode() {
            return firstCachedNode;
        }

        private LinkedListNode getNodeFromCache() {
            return firstCachedNode;
        }


}
