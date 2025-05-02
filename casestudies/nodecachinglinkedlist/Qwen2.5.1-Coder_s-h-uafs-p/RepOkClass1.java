public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            count++;
        }
        return count == size;
    }


}
