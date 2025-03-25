public class RepOkClass1{
    public boolean repOK() {
        if (table == null) {
            return size == 0;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == 0) {
                    return false; // hash code is 0
                }
                if (e.key == null && e.value != null) {
                    return false; // key is null but value is not
                }
                if (e.key != null && e.value == null) {
                    return false; // key is not null but value is null
                }
                e = next;
            }
        }
    
        return true;
    }

    public boolean repOK() {
        if (table == null) {
            return size == 0;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == 0) {
                    return false; // hash code is 0
                }
                if (e.key == null && e.value != null) {
                    return false; // key is null but value is not
                }
                if (e.key != null && e.value == null) {
                    return false; // key is not null but value is null
                }
                if (e.next != null && e.next.hash == e.hash) {
                    return false; // next entry has the same hash code
                }
                e = next;
            }
        }
    
        if (size != countEntries()) {
            return false; // size is not equal to the number of entries
        }
    
        if (threshold != (int) (table.length * loadFactor)) {
            return false; // threshold is not equal to the expected value
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
