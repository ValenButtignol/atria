public class RepOkClass1 {
    public boolean property() {
        if (size == 0) {
            return header.next == header && header.previous == header;
        } else {
            return header.next != header && header.previous != header 
                   && header.next.previous == header 
                   && header.previous.next == header;
        }
    }
}
