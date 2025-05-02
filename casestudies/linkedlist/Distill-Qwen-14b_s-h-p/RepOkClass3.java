public class RepOkClass3{
    private boolean property_3() {
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.next == null || e.previous == null) {
                return false;
            }
        }
        return true;
    }


}
