public class RepOkClass4 {
    public boolean property_4() {
        int count = 0;
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            count++;
        }
        return count == size;
    }
}
