public class RepOkClass1{
    public boolean repOK_1() {
        if (header.next == header) {
            return size == 0;
        }
    
        Entry current = header.next;
        while (current != header) {
            if (current.next == current || current.previous == current) {
                return false;
            }
            current = current.next;
        }
    
        if (size != countElements()) {
            return false;
        }
    
        return true;
    }

    private int countElements() {
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count;
    }


}
