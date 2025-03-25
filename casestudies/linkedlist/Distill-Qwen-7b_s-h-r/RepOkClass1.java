public class RepOkClass1{
    public boolean repOK() {
        Entry e = header.next;
        int count = 0;
        while (e != header) {
            if (e.element != null) {
                count++;
            }
            e = e.next;
        }
        if (count != size || count < 0) {
            return false;
        }
        if (header.previous != header) {
            return false;
        }
        if (header.next != header) {
            return false;
        }
        Entry last = header.next;
        while (last.next != header) {
            last = last.next;
        }
        if (last.next != header) {
            return false;
        }
        return true;
    }


}
