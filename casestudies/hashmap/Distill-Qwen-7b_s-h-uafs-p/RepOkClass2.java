public class RepOkClass2{
    public boolean property() {
        for (Entry e : table) {
            Object key = e.getKey();
            Object value = e.getValue();
            int computedHash = (key == NULL_KEY ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
            if (computedHash != e.hashCode()) {
                return false;
            }
        }
        return true;
    }


}
