public class RepOkClass1{
    public boolean repOK() {
        if (size < 0 || size > table.length) {
            return false;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash < 0 || e.hash >= table.length || e.key == null) {
                    return false;
                }
                e = e.next;
            }
        }
    
        return true;
    }


}
