public class RepOkClass1{
    public boolean repOK() {
        // Check if the table is null or has an invalid capacity
        if (table == null) {
            return false;
        }
        int capacity = table.length;
        if (capacity == 0) {
            return false;
        }
        // Ensure capacity is a power of two
        if ((capacity & (capacity - 1)) != 0) {
            return false;
        }
    
        // Check if size is within bounds (unless at maximum capacity)
        if (capacity != MAXIMUM_CAPACITY && size >= threshold) {
            return false;
        }
    
        // Verify threshold is correctly calculated
        if (threshold != (int) (capacity * loadFactor)) {
            return false;
        }
    
        // Ensure load factor is valid
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check each entry in the table
        for (Entry e : table) {
            if (e != null) {
                // Key must be non-null unless it's the special NULL_KEY
                if (e.key != NULL_KEY && e.key == null) {
                    return false;
                }
    
                // Ensure next is either null or an Entry
                if (e.next != null && !(e.next instanceof Entry)) {
                    return false;
                }
            }
        }
    
        // modCount must be non-negative
        if (modCount < 0) {
            return false;
        }
    
        return true;
    }


}
