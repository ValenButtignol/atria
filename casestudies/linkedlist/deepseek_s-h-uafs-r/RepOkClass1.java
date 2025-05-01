public class RepOkClass1 {
    public boolean repOK() {
        if (header == null)
            return false;
    
        if (size < 0)
            return false;
    
        if (header.next == null || header.previous == null)
            return false;
    
        if (header.next != header.previous && size == 0)
            return false;
    
        if (header.next == header && header.previous == header && size != 0)
            return false;
    
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            if (current == null || current.next == null || current.previous == null)
                return false;
    
            if (current.next.previous != current || current.previous.next != current)
                return false;
    
            count++;
            current = current.next;
            if (count > size)
                return false;
        }
    
        if (count != size)
            return false;
    
        return true;
    }
}
