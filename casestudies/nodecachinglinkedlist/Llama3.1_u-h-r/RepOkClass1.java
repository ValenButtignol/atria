public class RepOkClass1{
    public boolean repOK() {
        return header != null && header.next == header && header.previous == header
                && size >= 0 && cacheSize >= 0 && cacheSize <= maximumCacheSize;
    }


}
