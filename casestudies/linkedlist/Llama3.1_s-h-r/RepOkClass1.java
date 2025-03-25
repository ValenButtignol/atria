public class RepOkClass1{
    public boolean repOK() {
        if (header.next != header) {
            Entry e = header.next;
            while (e != header) {
                if (e.previous.next != e || e.next.previous != e) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }


}
