public class RepOkClass1{
    public boolean property() {
        int count = 0;
        for (Entry e = header.next; e != header; e = e.next) {
            count++;
        }
        return count == size;
    }


}
