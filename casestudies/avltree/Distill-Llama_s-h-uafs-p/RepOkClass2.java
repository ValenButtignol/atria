public class RepOkClass2{
    public boolean property_2() {
        return dfs(root, null) != null;
    }

    private boolean dfs(AvlNode node, Integer parentValue) {
        if (node == null) {
            return true;
        }
    
        // Check left child
        if (node.left != null) {
            if (node.left.element <= node.element) {
                return false;
            }
            if (!dfs(node.left, node.element)) {
                return false;
            }
        }
    
        // Check right child
        if (node.right != null) {
            if (node.right.element <= node.element) {
                return false;
            }
            if (!dfs(node.right, node.element)) {
                return false;
            }
        }
    
        return true;
    }


}
