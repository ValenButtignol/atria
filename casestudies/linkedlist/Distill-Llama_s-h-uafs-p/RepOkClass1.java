public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        for (Entry current = header.next; current != header; current = current.next) {
            count++;
        }
        return count == size;
    }


}
