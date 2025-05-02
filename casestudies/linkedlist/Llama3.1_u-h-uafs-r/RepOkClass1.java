public class RepOkClass1{
    public boolean repOK_1() {
        if (header.next != header) {
            for (Entry e = header.next; e != header; e = e.next) {
                if (e.previous != e.previous.previous) {
                    return false;
                }
                if (e.next != e.next.next) {
                    return false;
                }
                if (e.previous == e || e.next == e) {
                    return false;
                }
            }
        }
        return true;
    }


}
