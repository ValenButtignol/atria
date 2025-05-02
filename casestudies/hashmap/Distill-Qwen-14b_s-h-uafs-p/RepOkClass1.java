public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                count++;
                e = e.next;
            }
        }
        return count == size;
    }


}
