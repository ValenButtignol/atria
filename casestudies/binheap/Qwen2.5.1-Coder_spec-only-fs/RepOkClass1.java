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
    
        if (!isAcyclic(root)) {
            return false;
        }
    
        if (!isMinHeapProperty(root)) {
            return false;
        }
    
        if (!noDuplicateKeys(root)) {
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
    
        return isAcyclicHelper(node.parent, visited) &&
               isAcyclicHelper(node.sibling, visited) &&
               isAcyclicHelper(node.child, visited);
    }

    private boolean isMinHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.child != null && node.key > node.child.key) {
            return false;
        }
    
        return isMinHeapProperty(node.sibling) && isMinHeapProperty(node.child);
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
    
        return noDuplicateKeysHelper(node.sibling, seenKeys) && noDuplicateKeysHelper(node.child, seenKeys);
    }


}
