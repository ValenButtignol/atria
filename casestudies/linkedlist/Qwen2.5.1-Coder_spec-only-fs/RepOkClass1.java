public class RepOkClass1{
    public boolean repOK() {
        if (header == null)
            return false;
    
        if (size < 0)
            return false;
    
        if (size == 0)
            return header.next == header && header.prev == header;
    
        Entry current = header.next;
        int count = 0;
    
        while (current != header) {
            if (current == null || current.prev == null || current.next == null)
                return false;
    
            if (current.prev.next != current || current.next.prev != current)
                return false;
    
            if (current.info == null)
                return false;
    
            count++;
            current = current.next;
        }
    
        return count == size;
    }


}
