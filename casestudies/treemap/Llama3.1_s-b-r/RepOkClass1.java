public class RepOkClass1{
    private boolean repOK() {
        // 1. The root is either null or a valid node
        if (root == null) {
            return true;
        }
        if (root.color != BLACK) {
            return false;
        }
        if (root.left != null && root.right != null) {
            return false;
        }
        if (root.left != null && root.left.parent != root) {
            return false;
        }
        if (root.right != null && root.right.parent != root) {
            return false;
        }
    
        // 2. All nodes have a valid parent
        for (Node node = root; node != null; node = node.left) {
            if (node.parent == null) {
                return false;
            }
        }
    
        // 3. All nodes have a valid color
        for (Node node = root; node != null; node = node.left) {
            if (node.color != RED && node.color != BLACK) {
                return false;
            }
        }
    
        // 4. All nodes have a valid key and value
        for (Node node = root; node != null; node = node.left) {
            if (node.key == null) {
                return false;
            }
            if (node.value == null) {
                return false;
            }
        }
    
        // 5. The tree is a valid binary search tree
        for (Node node = root; node != null; node = node.left) {
            if (node.left != null) {
                int cmp = compare(node.key, node.left.key);
                if (cmp >= 0) {
                    return false;
                }
            }
            if (node.right != null) {
                int cmp = compare(node.key, node.right.key);
                if (cmp <= 0) {
                    return false;
                }
            }
        }
    
        return true;
    }


}
