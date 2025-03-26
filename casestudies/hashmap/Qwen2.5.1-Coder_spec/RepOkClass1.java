public class RepOkClass1{
    public boolean repOK() {
        // Check initial capacity and load factor constraints
        if (initialCapacity < 0) {
            return false;
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        // Check threshold calculation
        if (threshold != (int) (table.length * loadFactor)) {
            return false;
        }
    
        // Check table initialization
        if (table == null || table.length != capacity) {
            return false;
        }
        for (Entry e : table) {
            if (e != null) {
                if (e.key == null || e.value == null || e.hash < 0 || e.next == null) {
                    return false;
                }
            }
        }
    
        // Check size constraint
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
    
        // Check modCount constraint
        if (modCount < 0) {
            return false;
        }
    
        return true;
    }


}
