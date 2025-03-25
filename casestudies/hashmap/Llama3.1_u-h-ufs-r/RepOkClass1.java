public class RepOkClass1{
    public boolean repOK() {
        if (table == null) {
            return size == 0;
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == e.key.hashCode() && !e.key.equals(e.value)) {
                    return false;
                }
                e = next;
            }
        }
    
        return true;
    }


}
