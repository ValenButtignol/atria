public class RepOkClass2{
    public boolean property_2() {
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            if (node.getValue() == null) {
                return false;
            }
        }
        return true;
    }


}
