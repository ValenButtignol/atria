public class RepOkClass1{
    public boolean repOK() {
        // Check if the root is null or if it is black
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        // Check if the tree is balanced
        if (!isBalanced(root)) {
            return false;
        }
    
        // Check if all keys are unique
        if (!areKeysUnique(root, null, null)) {
            return false;
        }
    
        // Check if the size attribute is correct
        if (size != countNodes(root)) {
            return false;
        }
    
        // Check if the map supports either natural ordering or custom ordering
        if (comparator != null && !isSorted(root, null, null, comparator)) {
            return false;
        }
    
        return true;
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private boolean areKeysUnique(Node node, K min, K max) {
        if (node == null) {
            return true;
        }
        if (min != null && compare(node.key, min) <= 0) {
            return false;
        }
        if (max != null && compare(node.key, max) >= 0) {
            return false;
        }
        return areKeysUnique(node.left, min, node.key) && areKeysUnique(node.right, node.key, max);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isSorted(Node node, K min, K max, Comparator<? super K> comparator) {
        if (node == null) {
            return true;
        }
        if (min != null && comparator.compare(node.key, min) <= 0) {
            return false;
        }
        if (max != null && comparator.compare(node.key, max) >= 0) {
            return false;
        }
        return isSorted(node.left, min, node.key, comparator) && isSorted(node.right, node.key, max, comparator);
    }


}
