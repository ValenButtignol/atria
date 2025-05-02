public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (size > table.length) {
            return false;
        }
    
        if (loadFactor <= 0 || loadFactor > 1) {
            return false;
        }
    
        if (threshold != (int) (table.length * loadFactor)) {
            return false;
        }
    
        Set<Object> keys = new HashSet<>();
        for (Entry e : table) {
            while (e != null) {
                if (keys.contains(e.key)) {
                    return false;
                }
                keys.add(e.key);
                e = e.next;
            }
        }
    
        if (keys.size() != size) {
            return false;
        }
    
        return true;
    }

    private static class Entry {
        Object key;
        Object value;
        Entry next;
    
        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }


}
