public class RepOkClass1{
    public boolean property_1() {
        int actualSize = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            actualSize++;
        }
        return size == actualSize;
    }


}
