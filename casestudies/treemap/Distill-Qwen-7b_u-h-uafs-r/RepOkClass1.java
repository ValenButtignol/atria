public class RepOkClass1{
    public boolean repOK() {
        if (size == 0) {
            if (root == null) {
                return true;
            }
            return false;
        }
    
        // Check root color
        if (root.color != BLACK) {
            return false;
        }
    
        // Collect all nodes for color checks
        Set<Node> nodes = new HashSet<>();
        collectNodes(root, nodes);
    
        // Check each node's color
        for (Node node : nodes) {
            if (node.color != RED && node.color != BLACK) {
                return false;
            }
        }
    
        // Check each node's parent to ensure no red-red parent-child
        for (Node node : nodes) {
            if (node.color == RED) {
                Node parent = node.parent;
                if (parent != null && parent.color == RED) {
                    return false;
                }
            }
        }
    
        // Check each leaf is black
        for (Node node : nodes) {
            if (node.left == null && node.right == null) {
                if (node.color != BLACK) {
                    return false;
                }
            }
        }
    
        // Check path consistency (number of black nodes from root)
        int blackCount = countBlackFromRoot(root);
        if (blackCount == -1) {
            return false;
        }
    
        // Ensure all paths have the same number of black nodes
        Set<Integer> blackCounts = new HashSet<>();
        collectBlackCounts(root, blackCount, blackCounts);
        if (blackCounts.size() != 1) {
            return false;
        }
    
        return true;
    }

    private void collectNodes(Node node, Set<Node> nodes) {
        if (node != null) {
            nodes.add(node);
            collectNodes(node.left, nodes);
            collectNodes(node.right, nodes);
        }
    }

    private int countBlackFromRoot(Node node) {
        if (node == null) {
            return -1;
        }
        int count = 0;
        if (node.color == BLACK) {
            count++;
        }
        Node parent = node.parent;
        if (parent != null) {
            count += countBlackFromRoot(parent);
        }
        return count;
    }

    private void collectBlackCounts(Node node, int currentCount, Set<Integer> counts) {
        if (node == null) {
            return;
        }
        int current = currentCount;
        if (node.color == BLACK) {
            current++;
        }
        counts.add(current);
        collectBlackCounts(node.left, current, counts);
        collectBlackCounts(node.right, current, counts);
    }

    private void checkLeavesAreBlack() {
        if (size == 0) {
            return;
        }
        collectNodes(root, new HashSet<>());
        for (Node node : nodes) {
            if (node.left == null && node.right == null) {
                if (node.color != BLACK) {
                    return false;
                }
            }
        }
    }


}
