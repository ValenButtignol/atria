public class RepOkClass3{
    public boolean property_3() {
        LinkedListNode current = header.next;
        while (current != header) {
            LinkedListNode nextNode = current.next;
            if (nextNode == current) {
                return false;
            }
            current = nextNode;
        }
        return true;
    }


}
