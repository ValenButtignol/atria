public class RepOkClass1{
    public boolean repOK_1() {
        // Check that the table size is a power of two
        if ((table.length & (table.length - 1)) != 0) {
            return false;
        }
    
        // Check for duplicate keys
        Set<Object> seenKeys = new HashSet<>();
        for (Entry e : table) {
            if (e == null) continue;
            Object key = e.getKey();
            if (seenKeys.contains(key)) {
                return false;
            }
            seenKeys.add(key);
        }
    
        // Check that the size matches the number of non-null entries in the table
        int nonNullCount = 0;
        for (Entry e : table) {
            if (e != null) {
                nonNullCount++;
            }
        }
        if (nonNullCount != size) {
            return false;
        }
    
        return true;
    }


}
