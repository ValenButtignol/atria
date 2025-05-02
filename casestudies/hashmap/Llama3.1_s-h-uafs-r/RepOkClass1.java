public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0)
            return false;
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash == 0)
                    return false;
                e = e.next;
            }
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == next.hash && e.key.equals(next.key))
                    return false;
                e = next;
            }
        }
    
        return true;
    }


}
