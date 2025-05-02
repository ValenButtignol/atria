public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check if the size is consistent with the actual number of nodes
        if (size != numNodes(Nodes)) {
            return false;
        }
    
        // Check the heap property (each node's key <= parent's key)
        if (!isHeapPropertyMaintained(Nodes)) {
            return false;
        }
    
        // Check the binomial tree property (each node's degree equals the number of children)
        if (!isBinomialTreePropertyMaintained(Nodes)) {
            return false;
        }
    
        // Check for unique keys
        if (!areKeysUnique(Nodes)) {
            return false;
        }
    
        // Check for acyclic structure
        if (!isAcyclic(Nodes)) {
            return false;
        }
    
        return true;
    }

    private int numNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.child) + numNodes(node.sibling);
    }

    private boolean isHeapPropertyMaintained(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.parent != null && node.key > node.parent.key) {
            return false;
        }
        return isHeapPropertyMaintained(node.child) && isHeapPropertyMaintained(node.sibling);
    }

    private boolean isBinomialTreePropertyMaintained(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        int degree = node.degree;
        if (node.child == null) {
            if (degree != 0) {
                return false;
            }
        } else {
            if (node.child.degree != degree - 1) {
                return false;
            }
            if (!isBinomialTreePropertyMaintained(node.child)) {
                return false;
            }
        }
        return isBinomialTreePropertyMaintained(node.sibling);
    }

    private boolean areKeysUnique(BinomialHeapNode node, Set<Integer> seenKeys) {
        if (node == null) {
            return true;
        }
        if (seenKeys.contains(node.key)) {
            return false;
        }
        seenKeys.add(node.key);
        return areKeysUnique(node.child, seenKeys) && areKeysUnique(node.sibling, seenKeys);
    }

    private boolean areKeysUnique(BinomialHeapNode node) {
        Set<Integer> seenKeys = new HashSet<>();
        return areKeysUnique(node, seenKeys);
    }

    private boolean isAcyclic(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return isAcyclic(node.child, visited) && isAcyclic(node.sibling, visited);
    }

    private boolean isAcyclic(BinomialHeapNode node) {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return isAcyclic(node, visited);
    }


}
