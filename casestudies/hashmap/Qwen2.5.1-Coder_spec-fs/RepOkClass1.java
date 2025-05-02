public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (size > table.length) {
            return false;
        }
    
        if (threshold < 0) {
            return false;
        }
    
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
    
        if (modCount < 0) {
            return false;
        }
    
        if (!noDuplicates()) {
            return false;
        }
    
        if (!isConsistentSize()) {
            return false;
        }
    
        return true;
    }

    private boolean noDuplicates() {
        Set<Object> keys = new HashSet<Object>();
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (!keys.add(e.key)) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }

    private boolean isConsistentSize() {
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                count++;
                e = e.next;
            }
        }
        return count == size;
    }


}
