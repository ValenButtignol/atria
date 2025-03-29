public class RepOkClass5{
    public boolean property() {
        int blackCount = 0;
        Node current = root;
        while (current != null) {
            blackCount += (current.color == BLACK) ? 1 : 0;
            current = current.left;
        }
        current = root;
        while (current != null) {
            blackCount += (current.color == BLACK) ? 1 : 0;
            current = current.right;
        }
        return blackCount == size;
    }


}
