public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the tree is empty
        if (root == null) {
            return size == 0;
        }
    
        // Check the size consistency with the actual number of nodes
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
    
        // Check BST property
        if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check AVL property
        if (!isAVL(root)) {
            return false;
        }
    
        // Check height consistency
        if (!checkHeights(root)) {
            return false;
        }
    
        // Check for cycles
        if (hasCycle(root)) {
            return false;
        }
    
        return true;
    }

    private int countNodes(AvlNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element < min || node.element > max) {
            return false;
        }
        return isBST(node.left, min, node.element) && isBST(node.right, node.element, max);
    }

    private boolean isAVL(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isAVL(node.left) && isAVL(node.right);
    }

    private boolean checkHeights(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int maxHeight = Math.max(leftHeight, rightHeight);
        if (node.height != maxHeight + 1) {
            return false;
        }
        return checkHeights(node.left) && checkHeights(node.right);
    }

    private boolean hasCycle(AvlNode node, Set<AvlNode> visited) {
        if (node == null) {
            return false;
        }
        if (visited.contains(node)) {
            return true;
        }
        visited.add(node);
        return hasCycle(node.left, visited) || hasCycle(node.right, visited);
    }

    private boolean hasCycle(AvlNode node) {
        Set<AvlNode> visited = new HashSet<>();
        return hasCycle(node, visited);
    }


}
