public class RepOkClass1{
    public boolean repOK_1() {
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
        if (!checkNode(root, null, 0, blackHeight, visitedNodes)) {
            return false;
        }
    
        return true;
    }

    private boolean checkNode(Node node, Node parent, int currentBlackHeight, int blackHeight, Set<Node> visitedNodes) {
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
    
        if (parent != null && node.color == RED && parent.color == RED) {
            return false;
        }
    
        if (node.left != null && node.right != null && compare(node.left.key, node.right.key) > 0) {
            return false;
        }
    
        if (!checkNode(node.left, node, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight, visitedNodes)) {
            return false;
        }
    
        if (!checkNode(node.right, node, currentBlackHeight + (node.color == BLACK ? 1 : 0), blackHeight, visitedNodes)) {
            return false;
        }
    
        return true;
    }


}
