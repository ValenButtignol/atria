public class RepOkClass2{
    public boolean property() {
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e != null && !(e instanceof Entry)) {
                return false;
            }
        }
        return true;
    }


}
