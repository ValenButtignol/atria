public class RepOkClass1{
        private boolean repOK() {
            // Check that header is never null
            if (header == null) {
                return false;
            }
    
            // Check that size is non-negative
            if (size < 0) {
                return false;
            }
    
            // Check that maximumCacheSize is fixed and equals default
            if (maximumCacheSize != DEFAULT_MAXIMUM_CACHE_SIZE) {
                return false;
            }
    
            // Check that cacheSize is between 0 and maximumCacheSize
            if (cacheSize < 0 || cacheSize > maximumCacheSize) {
                return false;
            }
    
            // Check that firstCachedNode is null or points to a valid node in the list
            if (firstCachedNode != null && firstCachedNode == header) {
                return false;
            }
    
            // Check that when adding to cache, cacheSize increases and does not exceed maximum
            if (cacheSize == maximumCacheSize && addNodeToCache(null)) {
                return false;
            }
    
            // Check that when removing from cache, cacheSize decreases and does not go below 0
            if (cacheSize == 0 && removeFromCache(null)) {
                return false;
            }
    
            return true;
        }


}
