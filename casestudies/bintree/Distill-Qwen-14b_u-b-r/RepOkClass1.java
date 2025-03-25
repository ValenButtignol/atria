public class RepOkClass1{
    public boolean repOK() {
        // Check that size is correct
        int actualSize = countNodes(root);
        if (actualSize != size) {
            throw new IllegalArgumentException("Size is inconsistent with actual number of nodes.");
        }
    
        // Check that the tree is a BST
        if (!checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Tree does not satisfy BST property.");
        }
    
        return true;
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
