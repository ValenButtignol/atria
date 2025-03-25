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
        if (!checkNode(root, blackHeight, visitedNodes)) {
            return false;
        }
    
        return true;
    }

    private boolean checkNode(Node node, int blackHeight, Set<Node> visitedNodes) {
        if (node == null) {
            return blackHeight != -1 ? blackHeight == 0 : true;
        }
    
        if (visitedNodes.contains(node)) {
            return false;
        }
        visitedNodes.add(node);
    
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
    
        if (node.color == RED && (node.left != null || node.right != null)) {
            return false;
        }
    
        int leftBlackHeight = -1;
        int rightBlackHeight = -1;
    
        if (node.left != null) {
            if (node.left.color == RED && node.color == RED) {
                return false;
            }
            leftBlackHeight = checkNode(node.left, blackHeight, visitedNodes);
        }
    
        if (node.right != null) {
            if (node.right.color == RED && node.color == RED) {
                return false;
            }
            rightBlackHeight = checkNode(node.right, blackHeight, visitedNodes);
        }
    
        if (leftBlackHeight == -1 || rightBlackHeight == -1) {
            return false;
        }
    
        if (leftBlackHeight != rightBlackHeight) {
            return false;
        }
    
        if (blackHeight == -1) {
            blackHeight = leftBlackHeight;
        }
    
        return blackHeight == leftBlackHeight && blackHeight == rightBlackHeight;
    }


}
