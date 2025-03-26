public class RepOkClass1{
    public boolean property() {
        if (header == null || header.next == null) {
            return true;
        }
        return header.next.previous == header;
    }


}
