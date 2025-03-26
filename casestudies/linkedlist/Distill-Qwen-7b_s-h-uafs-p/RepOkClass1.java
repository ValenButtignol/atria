public class RepOkClass1{
    public boolean property() {
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
