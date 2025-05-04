public class RepOkClass5 {
    public boolean property_5() {
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count == size;
    }
}
