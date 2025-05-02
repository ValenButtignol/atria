public class RepOkClass2{
    public boolean property_2() {
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.key == null) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }


}
