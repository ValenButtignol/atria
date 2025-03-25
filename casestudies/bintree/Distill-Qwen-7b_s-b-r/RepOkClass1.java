public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        }
        int actualSize = 0;
        Node current = root;
        while (current != null) {
            actualSize++;
            current = current.left;
        }
        return actualSize == size;
    }


}
