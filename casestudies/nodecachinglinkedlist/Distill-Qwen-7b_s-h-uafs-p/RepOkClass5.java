public class RepOkClass5{
    public boolean property_5() {
        if (cacheSize == 0) {
            return header == null;
        }
        
        // Check if all cached nodes are in the linked list
        for (LinkedListNode cachedNode : getCache()) {
            if (!isNodeInList(cachedNode)) {
                return false;
            }
        }
        
        // Check if all nodes in the linked list are in the cache
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (!isNodeInList(node)) {
                return false;
            }
            if (isNodeInCache(node)) {
                node = node.next;
            }
        }
        
        return true;
    }

    private boolean isNodeInList(LinkedListNode node) {
        LinkedListNode current = header.next;
        while (current != null) {
            if (current == node) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private boolean isNodeInCache(LinkedListNode node) {
        Set<LinkedListNode> cache = new HashSet<>();
        cache.add(firstCachedNode);
        while (!cache.isEmpty()) {
            cache.add(cache.remove().next);
        }
        return cache.contains(node);
    }


}
