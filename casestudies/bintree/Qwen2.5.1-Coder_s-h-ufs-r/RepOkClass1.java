public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        return checkTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkTree(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.info <= min || node.info >= max) {
            return false;
        }
    
        return checkTree(node.left, min, node.info) && checkTree(node.right, node.info, max);
    }


}
