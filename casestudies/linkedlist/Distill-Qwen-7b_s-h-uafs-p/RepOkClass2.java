public class RepOkClass2{
    public boolean property_2() {
        Entry header = (Entry) this.header;
        if (header == null) {
            return true; // Empty list satisfies the invariant
        }
        Entry nextNode = header.next;
        if (nextNode != null && nextNode.previous != header) {
            return false;
        }
        return true;
    }


}
