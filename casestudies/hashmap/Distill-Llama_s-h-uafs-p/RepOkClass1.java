public class RepOkClass1{
    public boolean property_1() {
        int count = 0;
        for (Entry e : table) {
            if (e != null) {
                count++;
            }
        }
        return count == size;
    }


}
