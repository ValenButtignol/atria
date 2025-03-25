public class RepOkClass1{
    public boolean repOK() {
        // Check if table is not null and its length is a power of 2
        if (table == null || (table.length & (table.length - 1)) != 0) {
            return false;
        }
    
        // Check if size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if threshold is calculated correctly
        if (threshold <= 0 || threshold > table.length * loadFactor) {
            return false;
        }
    
        // Check each entry in the table
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            int count = 0;
            while (e != null) {
                count++;
                e = e.next;
            }
            if (count != 0 && count != 1) {
                return false; // Each bucket should have either 0 or 1 entry
            }
        }
    
        // Check if size matches the number of entries in the table
        int actualSize = 0;
        for (Entry e : table) {
            while (e != null) {
                actualSize++;
                e = e.next;
            }
        }
        if (size != actualSize) {
            return false;
        }
    
        // Check if NULL_KEY is used correctly
        if (NULL_KEY == null) {
            return false;
        }
    
        return true;
    }


}
