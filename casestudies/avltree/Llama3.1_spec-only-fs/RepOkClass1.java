public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
        if (heightDiff > 1) {
            return false;
        }
    
        if (!isBalanced(root)) {
            return false;
        }
    
        if (!isAcyclic(root)) {
            return false;
        }
    
        return true;
    }

    private int getHeight(AvlNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private boolean isBalanced(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
    
        return isBalanced(node.left) && isBalanced(node.right);
    }

    private boolean isAcyclic(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        Set<AvlNode> visitedNodes = new HashSet<>();
        return isAcyclicHelper(node, visitedNodes);
    }

    private boolean isAcyclicHelper(AvlNode node, Set<AvlNode> visitedNodes) {
        if (node == null) {
            return true;
        }
    
        if (visitedNodes.contains(node)) {
            return false;
        }
    
        visitedNodes.add(node);
    
        return isAcyclicHelper(node.left, visitedNodes) && isAcyclicHelper(node.right, visitedNodes);
    }


}
