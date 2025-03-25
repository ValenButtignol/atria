public class RepOkClass1{
    public boolean repOK() {
        if (header.next != header || header.previous != header) {
            return false;
        }
        if (size < 0) {
            return false;
        }
        if (header.next != header) {
            Entry e = header.next;
            int count = 0;
            do {
                if (e.previous == null || e.next == null) {
                    return false;
                }
                e = e.next;
                count++;
            } while (e != header);
            if (count != size) {
                return false;
            }
        }
        Entry e = header.next;
        while (e != header) {
            if (e.previous.next != e || e.next.previous != e) {
                return false;
            }
            e = e.next;
        }
        return true;
    }


}
