public class RepOkClass1{
    public boolean property() {
        if (size == 0) {
            return true;
        }
        
        Comparator<? super K> comparator = this.comparator;
        
        return checkSubtree(root, comparator);
    }

    private boolean checkSubtree(Node node, Comparator<? super K> comparator) {
        if (node == null) {
            return true;
        }
        
        // Check left subtree
        if (node.left != null) {
            if (!compare(node.left.key, node.key) || !checkSubtree(node.left, comparator)) {
                return false;
            }
            // Ensure all left subtree nodes are less than node.key
            if (!checkSubtree(node.left, comparator)) {
                return false;
            }
        }
        
        // Check right subtree
        if (node.right != null) {
            if (!compare(node.right.key, node.key) || !checkSubtree(node.right, comparator)) {
                return false;
            }
            // Ensure all right subtree nodes are greater than node.key
            if (!checkSubtree(node.right, comparator)) {
                return false;
            }
        }
        
        return true;
    }


}
