public class RepOkClass1{
    public boolean property() {
        int actualSize = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            actualSize++;
        }
        return size == actualSize;
    }


}
