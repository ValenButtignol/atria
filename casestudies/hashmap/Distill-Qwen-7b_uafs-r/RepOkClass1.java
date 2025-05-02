public class RepOkClass1{
    public boolean repOK_1() {
        if (table == null) {
            return capacity == 0;
        }
    
        if (capacity == 0) {
            return table == new Entry[0];
        }
    
        if (capacity != table.length) {
            return false;
        }
    
        if (threshold > capacity) {
            return false;
        }
    
        if (threshold <= 0 || threshold > capacity) {
            return false;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null) {
                if (e.key == null || e.value == null) {
                    return false;
                }
                if (e.getValue().equals(e.getValue()) != true) {
                    return false;
                }
            }
        }
    
        return true;
    }


}
