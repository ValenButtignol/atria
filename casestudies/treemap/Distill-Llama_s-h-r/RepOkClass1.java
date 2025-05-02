public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the comparator is null
        if (comparator == null) {
            return false;
        }
    
        // Check if the root is null
        if (root == null && size != 0) {
            return false;
        }
    
        // Check if the size is correct
        if (size != (root == null ? 0 : (leftSize + rightSize + 1))) {
            return false;
        }
    
        // Check if all nodes have valid colors
        if (!allNodesHaveValidColors()) {
            return false;
        }
    
        // Check if each node has a parent
        if (!allNodesHaveParent()) {
            return false;
        }
    
        // Check if the root's color is BLACK
        if (root.color != BLACK) {
            return false;
        }
    
        return true;
    }

    private boolean allNodesHaveValidColors() {
        if (root == null) {
            return true;
        }
        return recursivelyCheckColors(root);
    }

    private boolean recursivelyCheckColors(Node node) {
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
        if (node.left != null) {
            if (!recursivelyCheckColors(node.left)) {
                return false;
            }
        }
        if (node.right != null) {
            if (!recursivelyCheckColors(node.right)) {
                return false;
            }
        }
        return true;
    }

    private boolean allNodesHaveParent() {
        if (root == null) {
            return true;
        }
        if (root.parent != null) {
            return true;
        }
        if (root.left != null || root.right != null) {
            return false;
        }
        return recursivelyCheckParent(node);
    }

    private boolean recursivelyCheckParent(Node node) {
        if (node.parent == null) {
            return false;
        }
        if (node.left != null) {
            if (node.left.parent != node) {
                return false;
            }
        }
        if (node.right != null) {
            if (node.right.parent != node) {
                return false;
            }
        }
        return recursivelyCheckParent(node.parent);
    }


}
