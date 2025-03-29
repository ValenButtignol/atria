public class RepOkClass1{
    public boolean repOK() {
        // Check if the tree is empty and size is 0
        if (root == null) {
            return size == 0;
        }
    
        // Check BST property
        if (!isBST(root)) {
            return false;
        }
    
        // Count the number of nodes
        int count = 0;
        if (root != null) {
            count++;
            Node left = root.left;
            Node right = root.right;
    
            // Check left subtree
            if (left != null) {
                if (left.value >= root.value) {
                    return false;
                }
                if (!repOK(left)) {
                    return false;
                }
            }
    
            // Check right subtree
            if (right != null) {
                if (right.value <= root.value) {
                    return false;
                }
                if (!repOK(right)) {
                    return false;
                }
            }
        }
    
        // Check size
        return count == size;
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        // Check left child
        if (node.left != null && node.left.value >= node.value) {
            return false;
        }
        // Check right child
        if (node.right != null && node.right.value <= node.value) {
            return false;
        }
        // Check left and right subtrees
        return isBST(node.left) && isBST(node.right);
    }


}
