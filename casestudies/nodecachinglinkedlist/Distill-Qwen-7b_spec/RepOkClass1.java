public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the header is null and firstCachedNode is null
        if (header == null && firstCachedNode == null) {
            return true;
        }
        // Check if the header is not null and firstCachedNode is not null
        if (header != null && firstCachedNode == null) {
            return false;
        }
        // Check if the size is at least the cacheSize
        if (size < cacheSize) {
            return false;
        }
        // Check if the cacheSize exceeds the maximumCacheSize
        if (cacheSize > maximumCacheSize) {
            return false;
        }
        // Check if the maximumCacheSize is at least the cacheSize
        if (maximumCacheSize < cacheSize) {
            return false;
        }
        // Check if the header is null when firstCachedNode is null
        if (header == null && firstCachedNode == null) {
            return true;
        }
        // Check if the header is not null when firstCachedNode is not null
        if (header != null && firstCachedNode != null) {
            return true;
        }
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
        // Check if the cacheSize is non-negative
        if (cacheSize < 0) {
            return false;
        }
        // Check if the maximumCacheSize is non-negative
        if (maximumCacheSize < 0) {
            return false;
        }
        // Check if the header is null when firstCachedNode is null
        if (header == null && firstCachedNode == null) {
            return true;
        }
        // Check if the header is not null when firstCachedNode is not null
        if (header != null && firstCachedNode != null) {
            return true;
        }
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
        // Check if the cacheSize is non-negative
        if (cacheSize < 0) {
            return false;
        }
        // Check if the maximumCacheSize is non-negative
        if (maximumCacheSize < 0) {
            return false;
        }
        return true;
    }


}
