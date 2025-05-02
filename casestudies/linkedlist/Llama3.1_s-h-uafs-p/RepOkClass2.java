public class RepOkClass2{
    public boolean property_2() {
        for (Entry e = header.next; e != header; e = e.next) {
            if (e.element == null) {
                return false;
            }
        }
        return true;
    }


}
