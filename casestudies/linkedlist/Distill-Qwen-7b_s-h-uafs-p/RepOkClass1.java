public class RepOkClass1{
    public boolean property_1() {
        int actualSize = 0;
        Entry current = header.next;
        while (current != header) {
            if (current != null) {
                actualSize++;
            }
            current = current.next;
        }
        return actualSize == size;
    }


}
