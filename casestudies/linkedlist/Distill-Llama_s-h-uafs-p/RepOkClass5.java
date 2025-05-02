public class RepOkClass5{
    public boolean property_5() {
        // Check if the header's next and previous are pointing to itself
        return header.next == header && header.previous == header;
    }


}
