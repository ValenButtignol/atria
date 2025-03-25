public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        }
        if (size == 0) {
            return false;
        }
        if (root.color != BLACK) {
            return false;
        }
        if (!checkNodes(root, null)) {
            return false;
        }
        if (!isBST(root, null, null)) {
            return false;
        }
        int actualSize = countNodes(root

}
