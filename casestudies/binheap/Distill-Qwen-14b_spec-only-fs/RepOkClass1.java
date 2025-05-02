public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is consistent with the actual number of nodes
        if (size != countNodes(root)) {
            return false;
        }
    
        // Check the heap property: every node's key is <= its parent's key
        if (!checkHeapProperty(root)) {
            return false;
        }
    
        // Check the binomial tree property: each node's degree equals the number of children,
        // and all children are binomial trees of the same order
        if (!checkBinomialTreeProperty(root)) {
            return false;
        }
    
        // Check for unique keys
        if (!areKeysUnique(root)) {
            return false;
        }
    
        // Check for acyclic structure
        if (!isAcyclic(root, new HashSet<>())) {
            return false;
        }
    
        return true;
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean checkHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.parent != null && node.key > node.parent.key) {
            return false;
        }
        return checkHeapProperty(node.left) && checkHeapProperty(node.right);
    }

    private boolean checkBinomialTreeProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.degree != countChildren(node)) {
            return false;
        }
        int expectedDegree = node.degree;
        for (BinomialHeapNode child = node.left; child != null; child = child.sibling) {
            if (child.degree != expectedDegree - 1) {
                return false;
            }
            if (!checkBinomialTreeProperty(child)) {
                return false;
            }
        }
        return true;
    }

    private int countChildren(BinomialHeapNode node) {
        int count = 0;
        for (BinomialHeapNode child = node.left; child != null; child = child.sibling) {
            count++;
        }
        return count;
    }

    private boolean areKeysUnique(BinomialHeapNode node, Set<Integer> seenKeys) {
        if (node == null) {
            return true;
        }
        if (seenKeys.contains(node.key)) {
            return false;
        }
        seenKeys.add(node.key);
        return areKeysUnique(node.left, seenKeys) && areKeysUnique(node.right, seenKeys);
    }

    public boolean areKeysUnique(BinomialHeapNode node) {
        return areKeysUnique(node, new HashSet<>());
    }

    private boolean isAcyclic(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return isAcyclic(node.left, visited) && isAcyclic(node.right, visited);
    }

    public boolean isAcyclic(BinomialHeapNode node) {
        return isAcyclic(node, new HashSet<>());
    }


}
