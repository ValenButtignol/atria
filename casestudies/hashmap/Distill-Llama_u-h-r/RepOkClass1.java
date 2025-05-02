public class RepOkClass1{
    public boolean repOK_1() {
        // Check size consistency
        int expectedSize = 0;
        for (Entry e : table) {
            if (e != null) {
                expectedSize++;
            }
        }
        if (size != expectedSize) {
            return false;
        }
    
        // Check next pointers consistency
        for (Entry e : table) {
            Entry next = e.next;
            while (next != null) {
                if (next.hash != e.hash || !eq(e.key, next.key)) {
                    return false;
                }
                next = next.next;
            }
        }
    
        // Check modCount consistency
        if (modCount != 0) {
            return false;
        }
    
        // Check table size is power of two and within limits
        if ((table.length & (table.length - 1)) != 0 || table.length > MAXIMUM_CAPACITY) {
            return false;
        }
    
        return true;
    }


}
