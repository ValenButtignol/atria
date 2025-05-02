public class RepOkClass1{
    public boolean repOK_1() {
        if (table == null) {
            return false;
        }
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.key == null && e.value != null) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }


}
