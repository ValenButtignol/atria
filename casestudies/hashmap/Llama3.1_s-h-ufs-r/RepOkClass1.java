public class RepOkClass1{
    public boolean repOK_1() {
        if (table == null) {
            return true;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == 0) {
                    return false;
                }
                e = next;
            }
        }
    
        return true;
    }


}
