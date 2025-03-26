public class RepOkClass1{
    public boolean property() {
        int count = 0;
        LinkedListNode current = header.next;
        while (current != header) {
            count++;
            current = current.next;
        }
        return count == size;
    }


}
