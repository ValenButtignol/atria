public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (root == null) {
            return size == 0;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        int blackHeight = -1;
        Set<Node> visitedNodes = new HashSet<>();
        if (!checkNode(root, 0, blackHeight, visitedNodes)) {
            return false;
        }
    
        return true;
    }

    private boolean checkNode(Node node, int currentBlackHeight, int blackHeight, Set<Node> visitedNodes) {
        if (node == null) {
            if (blackHeight == -1) {
                blackHeight = currentBlackHeight;
            } else if (blackHeight != currentBlackHeight) {
                return false;
            }
            return true;
        }
    
        if (!visitedNodes.add(node)) {
            return false;
        }
    
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
    
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            return false;
        }
    
        return checkNode(node.left, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight, visitedNodes) &&
               checkNode(node.right, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight, visitedNodes);
    }


}
