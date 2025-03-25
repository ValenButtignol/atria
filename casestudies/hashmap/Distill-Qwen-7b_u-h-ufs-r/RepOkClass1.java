public class RepOkClass1{
    public boolean repOK() {
        if (table == null) {
            return false;
        }
    
        int actualSize = 0;
        for (Entry e : table) {
            if (e != null) {
                actualSize++;
            }
        }
        if (size != actualSize) {
            return false;
        }
    
        if (threshold == Integer.MAX_VALUE) {
            if (capacity != MAXIMUM_CAPACITY) {
                return false;
            }
        } else if (threshold != (int) (capacity * loadFactor)) {
            return false;
        }
    
        if (modCount != this.modCount) {
            return false;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null) {
                if (e.hash != i) {
                    return false;
                }
                Entry next = e.next;
                if (next != null && next.hash != (i + 1)) {
                    return false;
                }
            }
        }
    
        if (size == 0) {
            return threshold == 0;
        }
        return true;
    }


}
