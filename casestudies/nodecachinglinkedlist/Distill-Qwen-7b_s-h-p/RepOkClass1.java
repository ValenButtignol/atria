public class RepOkClass1{
    public boolean property_1() {
        if (header == null || header.next == null) {
            return true;
        }
        return header.next.previous == header;
    }


}
