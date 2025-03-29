public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
        
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        int nodeCount = 0;
        Set<Node> visitedNodes = new HashSet<>();
        Node current = root;
    
        while (current != null) {
            if (!visitedNodes.add(current)) {
                return false;
            }
    
            nodeCount++;
            current = current.left;
        }
    
        current = root;
        while (current != null) {
            if (current.color == Color.RED && (current.left != null && current.left.color == Color.RED || current.right != null && current.right.color == Color.RED)) {
                return false;
            }
    
            if (current.color == Color.RED && (current.left == null || current.left.color == Color.BLACK) && (current.right == null || current.right.color == Color.BLACK)) {
                return false;
            }
    
            if (current.color == Color.BLACK && (current.left == null || current.left.color == Color.BLACK) && (current.right == null || current.right.color == Color.BLACK)) {
                return false;
            }
    
            current = current.left;
        }
    
        current = root;
        while (current != null) {
            int blackNodes = 0;
            Node temp = current;
            while (temp != null) {
                if (temp.color == Color.BLACK) {
                    blackNodes++;
                }
                temp = temp.left;
            }
    
            if (current.left != null) {
                int leftBlackNodes = 0;
                Node leftTemp = current.left;
                while (leftTemp != null) {
                    if (leftTemp.color == Color.BLACK) {
                        leftBlackNodes++;
                    }
                    leftTemp = leftTemp.left;
                }
    
                if (leftBlackNodes != blackNodes) {
                    return false;
                }
            }
    
            if (current.right != null) {
                int rightBlackNodes = 0;
                Node rightTemp = current.right;
                while (rightTemp != null) {
                    if (rightTemp.color == Color.BLACK) {
                        rightBlackNodes++;
                    }
                    rightTemp = rightTemp.left;
                }
    
                if (rightBlackNodes != blackNodes) {
                    return false;
                }
            }
    
            current = current.left;
        }
    
        return nodeCount == size;
    }


}
