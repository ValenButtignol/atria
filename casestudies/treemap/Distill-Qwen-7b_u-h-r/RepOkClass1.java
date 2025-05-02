public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
        
        if (!isRootBlack()) {
            return false;
        }
        
        int expectedBlackCount = countBlackFromRoot(root);
        if (expectedBlackCount == -1) {
            return false;
        }
        
        if (!checkNoRedNodeWithRedChild()) {
            return false;
        }
        
        return true;
    }

    private boolean isRootBlack() {
        return root.color == BLACK;
    }

    private int countBlackFromRoot(Node node) {
        if (node == null) {
            return -1;
        }
        int count = 1; // root is black
        if (node.left != null) {
            count += countBlackFromRoot(node.left);
        }
        if (node.right != null) {
            count += countBlackFromRoot(node.right);
        }
        return count;
    }

    private boolean checkNoRedNodeWithRedChild() {
        if (root == null) {
            return true;
        }
        if (root.color == RED) {
            return false;
        }
        if (root.left != null && (root.left.color == RED || root.left.right != null && root.left.right.color == RED)) {
            return false;
        }
        if (root.right != null && (root.right.color == RED || root.right.left != null && root.right.left.color == RED)) {
            return false;
        }
        return checkNoRedNodeWithRedChild(root.left) && checkNoRedNodeWithRedChild(root.right);
    }


}
