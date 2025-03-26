public class RepOkClass1{
    public boolean repOK() {
        // Check if the table size is a power of 2
        if ((table.length & (table.length - 1)) != 0) {
            return false;
        }
    
        // Check if the threshold is a multiple of the load factor
        if (threshold % loadFactor != 0) {
            return false;
        }
    
        // Check if the modCount is incremented correctly
        if (modCount != size + table.length) {
            return false;
        }
    
        // Check if all entries in the table are valid
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash == Integer.MIN_VALUE || e.hash == Integer.MAX_VALUE) {
                    return false;
                }
                if (e.key == null && e.hash != 0) {
                    return false;
                }
                e = e.next;
            }
        }
    
        // Check if the size is correct
        if (size != countEntries()) {
            return false;
        }
    
        return true;
    }

    private int countEntries() {
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
