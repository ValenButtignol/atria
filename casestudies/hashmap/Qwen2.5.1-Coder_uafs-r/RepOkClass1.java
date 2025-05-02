public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
        if (size > table.length) {
            return false;
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
        if (threshold <= 0) {
            return false;
        }
        if (threshold > table.length * loadFactor) {
            return false;
        }
        if (modCount < 0) {
            return false;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash < 0 || e.hash >= table.length) {
                    return false;
                }
                if (e.key == null || e.value == null) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }


}
