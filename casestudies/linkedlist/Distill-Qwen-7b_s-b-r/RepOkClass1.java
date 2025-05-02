public class RepOkClass1{
    public boolean repOK_1() {
        int expectedSize = size();
        if (expectedSize != size) {
            return false;
        }
        Entry current = header.next;
        Entry first = header.next;
        Entry last = header.previous;
        if (last != header) {
            for (int i = 0; i < expectedSize; i++) {
                Entry next = current.next();
                if (next == last) {
                    return false;
                }
                current = next;
            }
            return true;
        }
        return true;
    }


}
