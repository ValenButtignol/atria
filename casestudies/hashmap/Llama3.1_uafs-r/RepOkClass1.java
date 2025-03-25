public class RepOkClass1{
    public boolean repOK() {
        if (size < 0)
            return false;
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash == 0)
                    return false;
                if (e.next != null && e.next.hash == e.hash)
                    return false;
                e = e.next;
            }
        }
    
        return true;
    }


}
