public class RepOkClass1{
    public boolean repOK_1() {
        if (modCount < 0) {
            return false;
        }
    
        if (size != table.length || size != table.length / 2) {
            return false;
        }
    
        if (size == 0) {
            return true;
        }
    
        if (size > table.length) {
            return false;
        }
    
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                return false;
            }
        }
    
        if (loadFactor < 0 || loadFactor > 1) {
            return false;
        }
    
        if (threshold < 0) {
            return false;
        }
    
        return true;
    }


}
