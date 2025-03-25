public class RepOkClass1{
    public boolean repOK() {
        // Check 1: Size consistency
        int actualSize = 0;
        for (Entry[] tab : table) {
            for (Entry e = tab; e != null; e = e.next) {
                actualSize++;
            }
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check 2: No null keys except for NULL_KEY
        for (Entry[] tab : table) {
            for (Entry e = tab; e != null; e = e.next) {
                Object key = e.key;
                if (key != NULL_KEY && key == null) {
                    return false;
                }
            }
        }
    
        // Check 3: Correct hash values
        for (Entry[] tab : table) {
            for (Entry e = tab; e != null; e = e.next) {
                Object key = e.key;
                Object maskedKey = (key == NULL_KEY) ? null : key;
                int computedHash = hash(maskedKey);
                if (computedHash != e.hash) {
                    return false;
                }
            }
        }
    
        // Check 4: Load factor consistency
        int capacity = table.length;
        int expectedThreshold = (int) (capacity * loadFactor);
        if (threshold != expectedThreshold) {
            return false;
        }
    
        // Check 5: No duplicate keys
        Set<Object> keys = new HashSet<>();
        for (Entry[] tab : table) {
            for (Entry e = tab; e != null; e = e.next) {
                Object key = e.key == NULL_KEY ? null : e.key;
                if (key == null) {
                    if (keys.contains(null)) {
                        return false;
                    }
                    keys.add(null);
                } else {
                    if (keys.contains(key)) {
                        return false;
                    }
                    keys.add(key);
                }
            }
        }
    
        // Check 6: No cycles in Entry.next pointers
        Set<Entry> visited = new HashSet<>();
        for (Entry[] tab : table) {
            for (Entry e = tab; e != null; e = e.next) {
                if (visited.contains(e)) {
                    return false;
                }
                visited.add(e);
            }
        }
    
        // Check 7: Entry equality consistency
        Entry e1 = new Entry(hash("test"), "test", "value", null);
        Entry e2 = new Entry(hash("test"), "test", "value", null);
        Entry e3 = new Entry(hash("test"), "test", "different", null);
        if (!e1.equals(e2) || e1.equals(e3)) {
            return false;
        }
    
        return true;
    }


}
