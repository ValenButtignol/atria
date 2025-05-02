public class RepOkClass2{
    public boolean property_2() {
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                if (e.next != null && e.key.equals(e.next.key)) {
                    return false;
                }
                e = e.next;
            }
        }
        return true;
    }


}
