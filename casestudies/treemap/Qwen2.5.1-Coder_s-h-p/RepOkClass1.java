public class RepOkClass1{
    public boolean property_1() {
        return isRedBlackTree(root);
    }

    private boolean isRedBlackTree(Node node) {
        if (node == null) return true;
        
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            return false;
        }
        
        int leftBlackHeight = blackHeight(node.left);
        int rightBlackHeight = blackHeight(node.right);
        
        if (leftBlackHeight != rightBlackHeight) {
            return false;
        }
        
        return isRedBlackTree(node.left) && isRedBlackTree(node.right);
    }

    private int blackHeight(Node node) {
        if (node == null) return 1;
        
        int leftHeight = blackHeight(node.left);
        int rightHeight = blackHeight(node.right);
        
        if (leftHeight != rightHeight) {
            return -1;
        }
        
        return node.color == BLACK ? leftHeight + 1 : leftHeight;
    }


}
