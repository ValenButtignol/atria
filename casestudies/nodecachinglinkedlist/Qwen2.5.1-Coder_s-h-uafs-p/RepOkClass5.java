public class RepOkClass5{
    public boolean property() {
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (node.previous == null || node.next == null) {
                return false;
            }
            if (node.previous.next != node || node.next.previous != node) {
                return false;
            }
        }
        return true;
    }


}
