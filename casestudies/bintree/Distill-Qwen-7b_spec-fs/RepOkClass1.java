public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the BST property holds for all nodes
        if (!verifyBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
        
        // Check if the size is consistent with the number of nodes
        int actualSize = countNodes();
        return actualSize == size;
    }

    private boolean verifyBST(Node current, int min, int max) {
        if (current == null) {
            return true;
        }
        if (current.info <= min || current.info >= max) {
            return false;
        }
        boolean leftValid = verifyBST(current.left, min, current.info - 1);
        boolean rightValid = verifyBST(current.right, current.info + 1, max);
        return leftValid && rightValid;
    }

    private int countNodes() {
        return countNodesHelper(root);
    }

    private int countNodesHelper(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + countNodesHelper(current.left) + countNodesHelper(current.right);
    }


}
