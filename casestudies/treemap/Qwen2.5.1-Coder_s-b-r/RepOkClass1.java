public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true; // An empty tree satisfies all properties
        }
    
        // Check if the root is black
        if (root.color != BLACK) {
            return false;
        }
    
        // Check if all leaves are black
        if (!isLeafBlack(root)) {
            return false;
        }
    
        // Check the Red-Black properties
        if (!isRedBlackPropertySatisfied(root)) {
            return false;
        }
    
        // Check the BST property
        if (!isBSTPropertySatisfied(root, null, null)) {
            return false;
        }
    
        return true;
    }

    private boolean isLeafBlack(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return node.color == BLACK;
        }
        return isLeafBlack(node.left) && isLeafBlack(node.right);
    }

    private boolean isRedBlackPropertySatisfied(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
        return isRedBlackPropertySatisfied(node.left) && isRedBlackPropertySatisfied(node.right);
    }

    private boolean isBSTPropertySatisfied(Node node, K min, K max) {
        if (node == null) {
            return true;
        }
        if (min != null && compare(node.key, min) <= 0) {
            return false;
        }
        if (max != null && compare(node.key, max) >= 0) {
            return false;
        }
        return isBSTPropertySatisfied(node.left, min, node.key) && isBSTPropertySatisfied(node.right, node.key, max);
    }


}
