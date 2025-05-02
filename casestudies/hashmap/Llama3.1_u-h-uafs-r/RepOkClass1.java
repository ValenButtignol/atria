public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0)
            return false;
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash == Integer.MIN_VALUE)
                    return false;
                e = e.next;
            }
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == hash(e.key) && !eq(e.key, next == null ? null : next.key))
                    return false;
                e = next;
            }
        }
    
        return true;
    }

    public boolean repOK_1() {
        if (size < 0)
            return false;
    
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            return false;
    
        if (threshold < 0 || threshold > Integer.MAX_VALUE)
            return false;
    
        if (table.length != 1 << (31 - Integer.numberOfLeadingZeros(table.length)))
            return false;
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.hash == Integer.MIN_VALUE)
                    return false;
                e = e.next;
            }
        }
    
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Entry next = e.next;
                if (e.hash == hash(e.key) && !eq(e.key, next == null ? null : next.key))
                    return false;
                e = next;
            }
        }
    
        return true;
    }


}
