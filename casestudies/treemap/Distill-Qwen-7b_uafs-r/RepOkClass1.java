public class RepOkClass1{
    public boolean repOK_1() {
        if (size != countNodes(root)) {
            return false;
        }
        
        if (!isBST(root)) {
            return false;
        }
        
        if (!isBalanced(root)) {
            return false;
        }
        
        if (root == null && size != 0) {
            return false;
        }
        
        if (!isRootBlack()) {
            return false;
        }
        
        return true;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
        
        int leftMax = (node.left != null) ? node.left.key : -1;
        int rightMin = (node.right != null) ? node.right.key : Integer.MAX_VALUE;
        
        if (node.left != null && node.left.key >= node.key) {
            return false;
        }
        
        if (node.right != null && node.right.key <= node.key) {
            return false;
        }
        
        return isBST(node.left) && isBST(node.right);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        
        int leftHeight = node.left == null ? -1 : height(node.left);
        int rightHeight = node.right == null ? -1 : height(node.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private boolean isRootBlack() {
        return root != null && root.color == BLACK;
    }


}
