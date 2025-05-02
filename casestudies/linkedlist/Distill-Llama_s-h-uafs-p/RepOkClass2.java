public class RepOkClass2{
    public boolean property_2() {
        Set<Object> seenElements = new HashSet<>();
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element != null) {
                if (seenElements.contains(e.element)) {
                    return false;
                }
                seenElements.add(e.element);
            }
        }
        return true;
    }


}
