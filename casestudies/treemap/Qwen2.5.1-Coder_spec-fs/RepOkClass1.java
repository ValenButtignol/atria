public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        int blackHeight = -1;
        boolean isBalanced = checkRedBlackProperties(root, 0, blackHeight);
    
        return isBalanced;
    }

    private boolean checkRedBlackProperties(Node node, int currentBlackHeight, int[] blackHeight) {
        if (node == null) {
            if (blackHeight == -1) {
                blackHeight[0] = currentBlackHeight;
            } else if (blackHeight[0] != currentBlackHeight) {
                return false;
            }
            return true;
        }
    
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            return false;
        }
    
        if (!checkRedBlackProperties(node.left, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight)) {
            return false;
        }
    
        if (!checkRedBlackProperties(node.right, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight)) {
            return false;
        }
    
        return true;
    }


}
