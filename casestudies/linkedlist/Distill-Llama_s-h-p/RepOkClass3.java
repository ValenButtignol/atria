public class RepOkClass3{
    public boolean property() {
        if (size == 0) {
            return true;
        }
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element == null) {
                return false;
            }
        }
        return true;
    }


}
