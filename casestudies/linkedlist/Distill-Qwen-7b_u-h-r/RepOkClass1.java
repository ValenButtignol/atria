public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) return false;
        if (header.next == header) return false;
        Entry e = header.next;
        while (e != header) {
            if (e.next == null || e.previous == null) return false;
            e = e.next;
        }
        e.next = header;
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            if (current.element != null) count++;
            current = current.next;
        }
        return count == size;
    }


}
