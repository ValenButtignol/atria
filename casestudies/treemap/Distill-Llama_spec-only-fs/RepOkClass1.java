public class RepOkClass1{
    public boolean repOK() {
        // Check for negative size
        if (size < 0) {
            return false;
        }
    
        // Check if the tree is empty
        if (size == 0) {
            return root == null;
        }
    
        // Check if the root is null when the tree is not empty
        if (root == null) {
            return false;
        }
    
        // Check heap property and no duplicates
        checkHeapProperty(root);
    
        // Check balanced property
        if (!isBalanced(root)) {
            return false;
        }
    
        // Check size consistency
        int nodeCount = countNodes(root);
        return nodeCount == size;
    }

    private void checkHeapProperty(Node root) {
        if (root == null) {
            return;
        }
    
        // Check parent-child relationship using the comparator
        if (getComparator().compare(root.getKey(), root.getParent().getKey()) <= 0) {
            return;
        }
    
        // Check for duplicates
        if (root.getKey() == root.getParent().getKey()) {
            return;
        }
    
        checkHeapProperty(root.getLeft());
        checkHeapProperty(root.getRight());
    }

    private boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
    
        // Calculate the height of the current node
        int height = 1;
        if (root.getLeft() != null) {
            height = 1 + isBalanced(root.getLeft());
        }
        if (root.getRight() != null) {
            int rightHeight = 1 + isBalanced(root.getRight());
            height = Math.max(height, rightHeight);
        }
    
        // Check if the height is within the logarithmic bound
        return height <= getLog2(size) + 1;
    }

    private int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
    
        return 1 + countNodes(root.getLeft()) + countNodes(root.getRight());
    }

    private int getLog2(int n) {
        return (int) Math.log(n) / Math.log(2);
    }


}
