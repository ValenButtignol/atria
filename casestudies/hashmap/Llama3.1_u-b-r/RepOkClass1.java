public class RepOkClass1{
    public boolean repOK() {
        // Check if the table is not null
        if (table == null) {
            return false;
        }
    
        // Check if the size is not negative
        if (size < 0) {
            return false;
        }
    
        // Check if the threshold is not negative
        if (threshold < 0) {
            return false;
        }
    
        // Check if the load factor is not negative or NaN
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check if the modCount is not negative
        if (modCount < 0) {
            return false;
        }
    
        // Check if the table is not empty and all entries are valid
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                // Check if the key and value are not null
                if (e.key == null || e.value == null) {
                    return false;
                }
                // Check if the hash code is valid
                if (e.hash < 0) {
                    return false;
                }
                // Move to the next entry
                e = e.next;
            }
        }
    
        // Check if the size is equal to the number of non-null entries in the table
        if (size != countNonNullEntries(table)) {
            return false;
        }
    
        return true;
    }

    private int countNonNullEntries(Entry[] table) {
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                count++;
                e = e.next;
            }
        }
        return count;
    }


}
