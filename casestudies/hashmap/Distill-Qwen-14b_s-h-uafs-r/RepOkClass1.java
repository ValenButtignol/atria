public class RepOkClass1{
    public boolean repOK() {
        // Check that the table is initialized and has a valid capacity
        if (table == null) {
            return false;
        }
        int capacity = table.length;
        if (capacity < 1 || (capacity & (capacity - 1)) != 0) {
            return false; // Capacity must be a power of two and at least 1
        }
        if (capacity > MAXIMUM_CAPACITY) {
            return false;
        }
    
        // Check that the load factor is valid
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check that the threshold is valid
        if (threshold < 0 || threshold > capacity) {
            return false;
        }
    
        // Check that the size is consistent with the threshold
        if (size > threshold) {
            return false;
        }
    
        // Check that all entries are valid
        for (int i = 0; i < capacity; i++) {
            Entry e = table[i];
            while (e != null) {
                // Check that the entry's key is either null (represented by NULL_KEY) or valid
                if (e.key != null && e.key != HashMap.NULL_KEY) {
                    // Check that the key's hash is correctly computed
                    int computedHash = HashMap.hash(e.key);
                    if (e.hash != computedHash) {
                        return false;
                    }
                }
                // Check that the value can be null
                if (e.value == null) {
                    // This is allowed
                } else {
                    // Check that the value is not null (though it's allowed to be null)
                    // No further check needed as null is allowed
                }
                // Check that the entry's next pointer is either null or points to another entry
                if (e.next != null && !(e.next instanceof Entry)) {
                    return false;
                }
                e = e.next;
            }
        }
    
        // Check that the modCount is non-negative
        if (modCount < 0) {
            return false;
        }
    
        // Check that the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check that the threshold is not negative
        if (threshold < 0) {
            return false;
        }
    
        // Check that the load factor is not NaN
        if (Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check that the table is cycle-free
        Set<Entry> visited = new HashSet<>();
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
