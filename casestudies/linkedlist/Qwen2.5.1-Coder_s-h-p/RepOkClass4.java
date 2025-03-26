public class RepOkClass4{
    public boolean property() {
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element == null) {
                return false;
            }
        }
        return true;
    }


}
