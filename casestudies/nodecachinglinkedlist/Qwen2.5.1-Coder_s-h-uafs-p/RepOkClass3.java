public class RepOkClass3{
    public boolean property() {
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (node.getValue() == null) {
                return false;
            }
        }
        return true;
    }


}
