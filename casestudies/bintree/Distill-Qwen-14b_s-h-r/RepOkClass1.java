public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        } else {
            int actualSize = countNodes(root);
            if (actualSize != size) {
                return false;
            }
            return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }


}
