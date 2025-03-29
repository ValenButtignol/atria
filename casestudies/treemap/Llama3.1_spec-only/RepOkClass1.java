public class RepOkClass1{
    public boolean repOK() {
        // Check if the tree is self-balancing
        return isSelfBalancing(root);
    
        // Check if the tree maintains the red-black tree properties
        return isRedBlackTree(root);
    
        // Check if the size of the tree is consistent with its nodes
        return size == countNodes(root);
    }

    private boolean isSelfBalancing(Node root) {
        if (root == null) {
            return true;
        }
        int heightLeft = getHeight(root.left);
        int heightRight = getHeight(root.right);
        return Math.abs(heightLeft - heightRight) <= 1 && isSelfBalancing(root.left) && isSelfBalancing(root.right);
    }

    private boolean isRedBlackTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.color == Color.RED && (root.left != null && root.left.color == Color.RED || root.right != null && root.right.color == Color.RED)) {
            return false;
        }
        if (root.color == Color.RED && root.left != null && root.left.color == Color.RED && root.right != null && root.right.color == Color.RED) {
            return false;
        }
        if (root.color == Color.BLACK && root.left != null && root.left.color == Color.RED || root.right != null && root.right.color == Color.RED) {
            return false;
        }
        return isRedBlackTree(root.left) && isRedBlackTree(root.right);
    }

    private int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }


}
