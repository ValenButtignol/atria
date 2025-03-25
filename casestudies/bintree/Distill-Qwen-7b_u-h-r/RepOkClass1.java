public class RepOkClass1{
    public boolean repOK() {
        if (size == 0 && root != null) {
            return false;
        }
        if (size > 0 && root == null) {
            return false;
        }
        int actualSize = countNodes(root);
        return actualSize == size;
    }

    private int countNodes(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + countNodes(current.left) + countNodes(current.right);
    }


}
