public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size matches the actual number of nodes
        if (size != countNodes(Nodes)) {
            return false;
        }
    
        // Check if the heap is acyclic
        if (!isAcyclic()) {
            return false;
        }
    
        // Check if the heap order property holds
        if (!isHeapOrdered()) {
            return false;
        }
    
        // Check if the binomial tree properties hold
        if (!isBinomialTree()) {
            return false;
        }
    
        // Check if there are no duplicate keys
        if (!hasUniqueKeys()) {
            return false;
        }
    
        return true;
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.child) + countNodes(node.sibling);
    }

    private boolean isAcyclic() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return isAcyclicHelper(Nodes, visited);
    }

    private boolean isAcyclicHelper(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return isAcyclicHelper(node.child, visited) && isAcyclicHelper(node.sibling, visited);
    }

    private boolean isHeapOrdered() {
        return isHeapOrderedHelper(Nodes);
    }

    private boolean isHeapOrderedHelper(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null && node.child.key < node.key) {
            return false;
        }
        return isHeapOrderedHelper(node.child) && isHeapOrderedHelper(node.sibling);
    }

    private boolean isBinomialTree() {
        return isBinomialTreeHelper(Nodes);
    }

    private boolean isBinomialTreeHelper(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        // Check if the degree matches the number of children
        if (node.degree != countChildren(node)) {
            return false;
        }
        // Check if siblings are ordered correctly
        if (node.sibling != null && node.key > node.sibling.key) {
            return false;
        }
        return isBinomialTreeHelper(node.child) && isBinomialTreeHelper(node.sibling);
    }

    private int countChildren(BinomialHeapNode node) {
        if (node == null || node.child == null) {
            return 0;
        }
        int count = 1;
        BinomialHeapNode current = node.child;
        while (current.sibling != null) {
            count++;
            current = current.sibling;
        }
        return count;
    }

    private boolean hasUniqueKeys() {
        Set<Integer> keys = new HashSet<>();
        return hasUniqueKeysHelper(Nodes, keys);
    }

    private boolean hasUniqueKeysHelper(BinomialHeapNode node, Set<Integer> keys) {
        if (node == null) {
            return true;
        }
        if (!keys.add(node.key)) {
            return false;
        }
        return hasUniqueKeysHelper(node.child, keys) && hasUniqueKeysHelper(node.sibling, keys);
    }


}
