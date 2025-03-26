public class RepOkClass3{
    public boolean property() {
        int count = 0;
        for (Entry e : table) {
            while (e != null) {
                count++;
                e = e.next;
            }
        }
        return count == size;
    }


}
