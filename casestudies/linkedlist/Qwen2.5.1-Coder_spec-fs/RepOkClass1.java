public class RepOkClass1{
    public boolean repOK_1() {
        if (header == null)
            return false;
    
        if (size < 0)
            return false;
    
        if (header.next == null || header.previous == null)
            return false;
    
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            if (current.previous == null || current.next == null)
                return false;
            current = current.next;
        }
    
        return count == size;
    }


}
