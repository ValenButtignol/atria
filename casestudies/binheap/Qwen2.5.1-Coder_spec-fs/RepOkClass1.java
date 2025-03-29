public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return Nodes == null;
        }
    
        if (Nodes == null) {
            return false;
        }
    
        if (!isAcyclic(Nodes)) {
            return false;
        }
    
        if (!isMinHeap(Nodes)) {
            return false;
        }
    
        if (!noDuplicateKeys(Nodes)) {
            return false;
        }
    
        return true;
    }

    private boolean isAcyclic(BinomialHeapNode node) {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return isAcyclicHelper(node, visited);
    }

    private boolean isAcyclicHelper(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
    
        if (!visited.add(node)) {
            return false;
        }
    
        if (!isAcyclicHelper(node.child, visited)) {
            return false;
        }
    
        if (!isAcyclicHelper(node.sibling, visited)) {
            return false;
        }
    
        return true;
    }

    private boolean isMinHeap(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.child != null && node.key > node.child.key) {
            return false;
        }
    
        if (node.sibling != null && node.key > node.sibling.key) {
            return false;
        }
    
        if (!isMinHeap(node.child)) {
            return false;
        }
    
        if (!isMinHeap(node.sibling)) {
            return false;
        }
    
        return true;
    }

    private boolean noDuplicateKeys(BinomialHeapNode node) {
        Set<Integer> seenKeys = new HashSet<>();
        return noDuplicateKeysHelper(node, seenKeys);
    }

    private boolean noDuplicateKeysHelper(BinomialHeapNode node, Set<Integer> seenKeys) {
        if (node == null) {
            return true;
        }
    
        if (!seenKeys.add(node.key)) {
            return false;
        }
    
        if (!noDuplicateKeysHelper(node.child, seenKeys)) {
            return false;
        }
    
        if (!noDuplicateKeysHelper(node.sibling, seenKeys)) {
            return false;
        }
    
        return true;
    }


}
