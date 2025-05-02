public class RepOkClass1{
    public boolean repOK_1() {
        return repOK_1(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean repOK_1(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return repOK_1(node.left, min, node.info) && repOK_1(node.right, node.info, max);
    }


}
