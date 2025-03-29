public class RepOkClass1{
    public boolean repOK() {
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        if (size < 0) {
            return false;
        }
    
        int actualSize = 0;
        Set<Node> visitedNodes = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current == null) {
                continue;
            }
    
            if (visitedNodes.contains(current)) {
                return false; // Detected a cycle
            }
    
            visitedNodes.add(current);
            actualSize++;
    
            if (current.color != RED && current.color != BLACK) {
                return false; // Invalid color
            }
    
            if (current.color == RED) {
                if (current.parent != null && current.parent.color == RED) {
                    return false; // Red node has a red parent
                }
            }
    
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    
        if (actualSize != size) {
            return false; // Size mismatch
        }
    
        // Check BST property
        if (!isBST(root)) {
            return false;
        }
    
        // Check black height consistency
        if (!checkBlackHeights(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isBST(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && compare(node.key, node.left.key) >= 0) {
            return false;
        }
    
        if (node.right != null && compare(node.key, node.right.key) <= 0) {
            return false;
        }
    
        return isBST(node.left) && isBST(node.right);
    }

    private boolean checkBlackHeights(Node node) {
        if (node == null) {
            return true;
        }
    
        int leftBlackHeight = getBlackHeight(node.left);
        int rightBlackHeight = getBlackHeight(node.right);
    
        if (leftBlackHeight != rightBlackHeight) {
            return false;
        }
    
        return checkBlackHeights(node.left) && checkBlackHeights(node.right);
    }

    private int getBlackHeight(Node node) {
        if (node == null) {
            return 0;
        }
    
        int height = getBlackHeight(node.left);
        if (node.color == BLACK) {
            height++;
        }
    
        return height;
    }


}
