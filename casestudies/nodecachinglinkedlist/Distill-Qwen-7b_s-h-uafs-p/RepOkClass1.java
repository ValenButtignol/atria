public class RepOkClass1{
    public boolean property_1() {
        int nodeCount = 0;
        LinkedListNode current = header.next;
        while (current != null) {
            nodeCount++;
            current = current.next;
        }
        return nodeCount == size;
    }


}
