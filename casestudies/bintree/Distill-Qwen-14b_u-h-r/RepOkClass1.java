public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info > max) {
            return false;
        }
        return checkBST(node.left, min, node.info) && checkBST(node.right, node.info, max);
    }


}
