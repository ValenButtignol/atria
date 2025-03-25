public class RepOkClass1{
    public boolean repOK() {
        // Check that the table is properly filled with valid entries or nulls
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null && (e.key == null || e.next == null)) {
                return false;
            }
        }
    
        // Check that all keys are unique
        Set<Object> seenKeys = new HashSet<>();
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null) {
                Object key = e.getKey();
                if (key == null) {
                    return false;
                }
                if (seenKeys.contains(key)) {
                    return false;
                }
                seenKeys.add(key);
            }
        }
    
        // Check that the load factor and threshold are maintained
        if (loadFactor > DEFAULT_LOAD_FACTOR || threshold < (int) (table.length * DEFAULT_LOAD_FACTOR / 2)) {
            return false;
        }
    
        // Check that modCount is consistent with operations
        int expectedModCount = 0;
        for (Entry e : table) {
            if (e != null) {
                expectedModCount++;
            }
        }
        if (modCount != expectedModCount) {
            return false;
        }
    
        return true;
    }


}
