public class RepOkClass4{
    public boolean property_4() {
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element != null && (e.previous.element == null || e.previous.element.compareTo(e.element) > 0)) {
                return false;
            }
            if (e.element != null && (e.next.element == null || e.next.element.compareTo(e.element) < 0)) {
                return false;
            }
        }
        return true;
    }


}
