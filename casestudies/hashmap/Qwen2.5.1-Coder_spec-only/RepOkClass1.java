public class RepOkClass1{
    public boolean repOK_1() {
        // Check initial capacity and load factor constraints
        if (initialCapacity < 0) {
            return false;
        }
        if (loadFactor <= 0) {
            return false;
        }
    
        // Check size constraints
        if (size < 0) {
            return false;
        }
        if (size > table.length) {
            return false;
        }
    
        // Check threshold constraints
        if (threshold <= 0) {
            return false;
        }
        if (threshold != (int) (table.length * loadFactor)) {
            return false;
        }
    
        // Check modCount constraints
        if (modCount < 0) {
            return false;
        }
    
        // Check the integrity of the hash table
        for (int i = 0; i < table.length; i++) {
            Entry<K, V> current = table[i];
            while (current != null) {
                // Check that each key is non-null
                if (current.key == null) {
                    return false;
                }
                // Check that each value is non-null
                if (current.value == null) {
                    return false;
                }
                // Check that the hash code of the key is consistent
                if (current.hash != current.key.hashCode()) {
                    return false;
                }
                // Check that the key is consistent with the hash code
                if (current.hash < 0 || current.hash >= table.length) {
                    return false;
                }
                current = current.next;
            }
        }
    
        // Check that the size is consistent with the entries in the hash table
        int actualSize = 0;
        for (int i = 0; i < table.length; i++) {
            Entry<K, V> current = table[i];
            while (current != null) {
                actualSize++;
                current = current.next;
            }
        }
        if (actualSize != size) {
            return false;
        }
    
        return true;
    }


}
