public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0)
            return false;
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.key == null && e.value != null)
                    return false;
                if (e.key != null && e.value == null)
                    return false;
                if (e.key != null && e.value != null && !e.key.equals(e.value))
                    return false;
                e = e.next;
            }
        }
    
        if (size > threshold)
            return false;
    
        if (loadFactor <= 0 || loadFactor > 1)
            return false;
    
        return true;
    }


}
