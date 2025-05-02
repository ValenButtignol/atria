public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        Entry current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count == size;
    }


}
