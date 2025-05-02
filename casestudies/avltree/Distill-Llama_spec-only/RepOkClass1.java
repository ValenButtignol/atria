public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the root is null (empty tree is valid)
        if (root == null) {
            return true;
        }
    
        // Check that left and right children are either null or instances of AvlNode
        if (root.left != null && !(root.left instanceof AvlNode)) {
            return false;
        }
        if (root.right != null && !(root.right instanceof AvlNode)) {
            return false;
        }
    
        // Calculate the heights of left and right subtrees, treating null as height -1
        int leftHeight = (root.left != null) ? root.left.height : -1;
        int rightHeight = (root.right != null) ? root.right.height : -1;
        int maxHeight = Math.max(leftHeight, rightHeight);
    
        // Ensure the root's height is at most one more than the maximum height of its subtrees
        if (root.height > maxHeight + 1) {
            return false;
        }
    
        // Recursively check the left and right subtrees
        return (root.left == null || root.left.repOK_1()) &&
               (root.right == null || root.right.repOK_1());
    }


}
