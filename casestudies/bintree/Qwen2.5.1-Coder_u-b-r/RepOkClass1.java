public class RepOkClass1{
    public boolean repOK() {
        return repOK(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean repOK(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return repOK(node.left, min, node.info) && repOK(node.right, node.info, max);
    }


}
