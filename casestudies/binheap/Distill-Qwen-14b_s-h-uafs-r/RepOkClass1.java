public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null)
            return size == 0;
    
        // Check that each node's degree equals the number of its children
        Set<BinomialHeapNode> allNodes = new HashSet<>();
        traverseAllNodes(Nodes, allNodes);
        for (BinomialHeapNode node : allNodes) {
            if (node.degree != countChildren(node)) {
                return false;
            }
        }
    
        // Check that the parent pointers form a valid tree structure
        for (BinomialHeapNode node : allNodes) {
            if (node.parent != null && !isParentValid(node)) {
                return false;
            }
        }
    
        // Check that the keys satisfy the min-heap property
        for (BinomialHeapNode node : allNodes) {
            if (node.key < 0) {
                return false;
            }
            if (node.child != null && !isMinHeapPropertySatisfied(node)) {
                return false;
            }
        }
    
        // Check that the size is correct
        int calculatedSize = calculateSize(Nodes);
        if (calculatedSize != size) {
            return false;
        }
    
        // Check that the root is correctly set
        if (Nodes.parent != null) {
            return false;
        }
    
        // Check that the sibling pointers form a valid linked list
        for (BinomialHeapNode node : allNodes) {
            if (!isSiblingListValid(node)) {
                return false;
            }
        }
    
        // Check that all keys are unique
        if (!areKeysUnique(Nodes)) {
            return false;
        }
    
        return true;
    }

    private boolean isParentValid(BinomialHeapNode node) {
        BinomialHeapNode parent = node.parent;
        if (parent == null) {
            return true;
        }
        return parent.child != null && parent.child.sibling == node;
    }

    private int countChildren(BinomialHeapNode node) {
        int count = 0;
        BinomialHeapNode child = node.child;
        while (child != null) {
            count++;
            child = child.sibling;
        }
        return count;
    }

    private boolean isMinHeapPropertySatisfied(BinomialHeapNode node) {
        if (node.child == null) {
            return true;
        }
        for (BinomialHeapNode child = node.child; child != null; child = child.sibling) {
            if (child.key < node.key) {
                return false;
            }
            if (!isMinHeapPropertySatisfied(child)) {
                return false;
            }
        }
        return true;
    }

    private int calculateSize(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + calculateSize(node.child) + calculateSize(node.sibling);
    }

    private boolean isSiblingListValid(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        int degree = node.degree;
        int childCount = 0;
        BinomialHeapNode child = node.child;
        while (child != null) {
            childCount++;
            child = child.sibling;
        }
        if (childCount != degree) {
            return false;
        }
        return isSiblingListValid(node.sibling);
    }

    private boolean areKeysUnique(BinomialHeapNode node) {
        Set<Integer> keys = new HashSet<>();
        return areKeysUniqueHelper(node, keys);
    }

    private boolean areKeysUniqueHelper(BinomialHeapNode node, Set<Integer> keys) {
        if (node == null) {
            return true;
        }
        if (!keys.add(node.key)) {
            return false;
        }
        return areKeysUniqueHelper(node.child, keys) && areKeysUniqueHelper(node.sibling, keys);
    }

    private void traverseAllNodes(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return;
        }
        visited.add(node);
        traverseAllNodes(node.child, visited);
        traverseAllNodes(node.sibling, visited);
    }


}
