public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        for (Entry e : table) {
            while (e != null) {
                count++;
                e = e.next;
            }
        }
        return size == count;
    }


}
