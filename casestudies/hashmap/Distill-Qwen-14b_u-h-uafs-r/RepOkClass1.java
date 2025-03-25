public class RepOkClass1{
    public boolean repOK() {
        if (table == null) {
            return size == 0 && threshold == 0 && loadFactor == DEFAULT_LOAD_FACTOR;
        }
    
        // Check capacity constraints
        int capacity = table.length;
        if (capacity < 1 || capacity > MAXIMUM_CAPACITY || (capacity & (capacity - 1)) != 0) {
            return false;
        }
    
        // Check load factor
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check size and threshold
        if (size < 0 || threshold < 0 || size > threshold || threshold > capacity * loadFactor) {
            return false;
        }
    
        // Check entries for null keys and correct hashing
        for (int i = 0; i < capacity; i++) {
            Entry e = table[i];
            while (e != null) {
                Object key = e.key;
                Object value = e.value;
    
                // Check key is not null (except for the special NULL_KEY)
                if (key != NULL_KEY && key == null) {
                    return false;
                }
    
                // Check hash consistency
                int computedHash = hash(maskNull(key));
                if (computedHash != e.hash) {
                    return false;
                }
    
                // Check next pointer
                if (e.next == null) {
                    e = null;
                } else if (!(e.next instanceof Entry)) {
                    return false;
                } else {
                    e = e.next;
                }
            }
        }
    
        // Check for cycles in linked lists
        Set<Node> visited = new HashSet<>();
        for (int i = 0; i < capacity; i++) {
            Entry e = table[i];
            while (e != null) {
                if (visited.contains(e)) {
                    return false; // Cycle detected
                }
                visited.add(e);
                e = e.next;
            }
        }
    
        return true;
    }


}
