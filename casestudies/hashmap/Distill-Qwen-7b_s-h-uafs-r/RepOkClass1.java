public class RepOkClass1{
    public boolean repOK_1() {
        if (modCount < 0) {
            return false;
        }
        if (size != table.length || size != (threshold / loadFactor)) {
            return false;
        }
        if (threshold <= 0 || loadFactor <= 0 || loadFactor > 1) {
            return false;
        }
        Entry[] table = this.table;
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null) {
                if (e.key == NULL_KEY) {
                    return false;
                }
                if (e.next == null && i != 0 && i != table.length - 1) {
                    return false;
                }
                if (e.hash < 0 || e.hash >= table.length) {
                    return false;
                }
                if (e.getValue() == null && e.key != NULL_KEY) {
                    return false;
                }
            }
        }
        return true;
    }


}
