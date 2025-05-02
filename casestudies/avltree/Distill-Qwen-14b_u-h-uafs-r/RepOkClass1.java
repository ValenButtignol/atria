public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
    
        // Check BST property
        if (!checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check AVL balance and height consistency
        if (!checkAVL(root)) {
            return false;
        }
    
        // Check size consistency
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
    
        return true;
    }

    private boolean checkBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.element <= min || node.element >= max) {
            return false;
        }
    
        return checkBST(node.left, min, node.element) && checkBST(node.right, node.element, max);
    }

    private boolean checkAVL(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = computeHeight(node.left);
        int rightHeight = computeHeight(node.right);
    
        // Check balance condition
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        // Check height consistency
        int computedHeight = leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
        if (computedHeight != node.height) {
            return false;
        }
    
        return checkAVL(node.left) && checkAVL(node.right);
    }

    private int computeHeight(AvlNode node) {
        if (node == null) {
            return -1;
        }
        return Math.max(computeHeight(node.left), computeHeight(node.right)) + 1;
    }

    private int countNodes(AvlNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
