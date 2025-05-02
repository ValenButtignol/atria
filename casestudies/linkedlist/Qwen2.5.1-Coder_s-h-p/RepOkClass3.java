public class RepOkClass3{
    public boolean property_3() {
        for (Entry e1 = header.next; e1 != header; e1 = e1.next) {
            for (Entry e2 = e1.next; e2 != header; e2 = e2.next) {
                if (e1.element.equals(e2.element)) {
                    return false;
                }
            }
        }
        return true;
    }


}
