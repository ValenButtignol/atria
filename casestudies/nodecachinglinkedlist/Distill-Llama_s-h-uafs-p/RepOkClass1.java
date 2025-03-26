public class RepOkClass1{
    public boolean property() {
        int actualSize = 0;
        LinkedListNode current = header.next;
        while (current != header && current != null) {
            actualSize++;
            current = current.next;
        }
        return actualSize == size;
    }


}
