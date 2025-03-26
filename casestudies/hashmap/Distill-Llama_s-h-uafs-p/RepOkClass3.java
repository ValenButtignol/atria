public class RepOkClass3{
    public boolean property() {
        for (Entry e : table) {
            if (e == null) continue;
            Object key = e.getKey();
            int computedHash = hash(key);
            if (computedHash != e.hash) {
                return false;
            }
        }
        return true;
    }


}
