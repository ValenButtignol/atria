public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        if (!isBalanced(root)) {
            return false;
        }
    
        if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        if (!hasUniqueElements(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private boolean isBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.data <= min || node.data >= max) {
            return false;
        }
    
        return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);
    }

    private boolean hasUniqueElements(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        Set<Integer> seen = new HashSet<>();
        return hasUniqueElements(node, seen);
    }

    private boolean hasUniqueElements(AvlNode node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
    
        if (!seen.add(node.data)) {
            return false;
        }
    
        return hasUniqueElements(node.left, seen) && hasUniqueElements(node.right, seen);
    }

    private int getHeight(AvlNode node) {
        if (node == null) {
            return 0;
        }
    
        return node.height;
    }


}
