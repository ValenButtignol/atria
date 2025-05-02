public class RepOkClass2{
    public boolean property_2() {
        Set<Object> seenValues = new HashSet<>();
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            Object value = node.getValue();
            if (value != null) {
                if (seenValues.contains(value)) {
                    return false;
                }
                seenValues.add(value);
            }
        }
        return true;
    }


}
