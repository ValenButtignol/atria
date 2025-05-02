public class RepOkClass1{
    public boolean repOK_1() {
        // Header node should not be null
        if (header == null) {
            return false;
        }
    
        // Size should equal cacheSize
        if (size != cacheSize) {
            return false;
        }
    
        // Header's next should point to the first node
        if (header.next != firstCachedNode) {
            return false;
        }
    
        // First node's previous should be null
        if (firstCachedNode != null && firstCachedNode.previous != null) {
            return false;
        }
    
        // Maximum cache size should be at least the default value
        if (maximumCacheSize < DEFAULT_MAXIMUM_CACHE_SIZE) {
            return false;
        }
    
        // Cache size should not exceed maximum cache size
        if (cacheSize > maximumCacheSize) {
            return false;
        }
    
        // Header's next should point to the first node (again)
        if (header.next != firstCachedNode) {
            return false;
        }
    
        // First node's previous should be null (again)
        if (firstCachedNode != null && firstCachedNode.previous != null) {
            return false;
        }
    
        // All checks passed
        return true;
    }


}
