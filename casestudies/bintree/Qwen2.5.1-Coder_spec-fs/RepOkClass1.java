public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) && checkSize(root, 0);
    }

    private boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.info <= min || node.info >= max) {
            return false;
        }
    
        return checkBST(node.left, min, node.info) && checkBST(node.right, node.info, max);
    }

    private boolean checkSize(Node node, int currentSize) {
        if (node == null) {
            return currentSize == size;
        }
    
        return checkSize(node.left, currentSize + 1) && checkSize(node.right, currentSize + 1);
    }


}
