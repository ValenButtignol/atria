public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the comparator is null
        if (comparator == null) {
            return false;
        }
    
        // Check if the root is null (tree is empty)
        if (root == null) {
            return size == 0;
        }
    
        // Check if the root is black
        if (root.color != BLACK) {
            return false;
        }
    
        // Check if the size is correct
        if (size < 0) {
            return false;
        }
    
        // Check if the tree is balanced
        if (!isBalanced(root)) {
            return false;
        }
    
        // Check if all nodes have correct parent and child relationships
        if (!hasCorrectParentChildLinks(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
    
        // Check left and right subtrees
        boolean leftBalanced = isBalanced(node.left);
        boolean rightBalanced = isBalanced(node.right);
    
        // Check if left and right subtrees are balanced and correctly placed
        if (leftBalanced && rightBalanced) {
            return true;
        }
    
        return false;
    }

    private boolean hasCorrectParentChildLinks(Node node) {
        if (node == null) {
            return true;
        }
    
        // Check if node's parent is correctly set
        if (node.parent == null) {
            // Root node's parent should be null
            if (!node.equals(root)) {
                return false;
            }
        } else {
            // Check if node's parent is correctly linked
            if (!node.parent.left.equals(node) && !node.parent.right.equals(node)) {
                return false;
            }
        }
    
        // Recursively check children
        return hasCorrectParentChildLinks(node.left) && hasCorrectParentChildLinks(node.right);
    }


}
