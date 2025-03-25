public class RepOkClass1{
    public boolean repOK() {
        if (size == 0) {
            return (header.next == header) && (header.previous == header);
        }
    
        Entry current = header.next;
        int count = 0;
        while (current != header && count < size) {
            count++;
            if (current.next == null || current.previous == null) {
                return false;
            }
            if (current.next.previous != current || current.previous.next != current) {
                return false;
            }
            current = current.next;
        }
    
        return (current == header) && (count == size);
    }


}
