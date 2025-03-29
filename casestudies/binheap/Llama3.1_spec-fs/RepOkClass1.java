public class RepOkClass1{
    public boolean repOK() {
        if (size < 0)
            return false;
    
        if (Nodes == null)
            return size == 0;
    
        if (!isHeapPropertyMaintained())
            return false;
    
        if (!isAcyclic())
            return false;
    
        if (size != countNodes())
            return false;
    
        if (!isConsistentDegree())
            return false;
    
        if (!noDuplicateKeys())
            return false;
    
        return true;
    }

    private boolean isHeapPropertyMaintained() {
        return isHeapPropertyMaintained(Nodes);
    }

    private boolean isHeapPropertyMaintained(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.parent != null && node.key >= node.parent.key)
            return false;
    
        return isHeapPropertyMaintained(node.sibling) && isHeapPropertyMaintained(node.child);
    }

    private boolean isAcyclic() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return isAcyclic(Nodes, visited);
    }

    private boolean isAcyclic(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null)
            return true;
    
        if (visited.contains(node))
            return false;
    
        visited.add(node);
    
        return isAcyclic(node.sibling, visited) && isAcyclic(node.child, visited);
    }

    private int countNodes() {
        return countNodes(Nodes);
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null)
            return 0;
    
        return 1 + countNodes(node.sibling) + countNodes(node.child);
    }

    private boolean isConsistentDegree() {
        return isConsistentDegree(Nodes);
    }

    private boolean isConsistentDegree(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.degree != countChildNodes(node))
            return false;
    
        return isConsistentDegree(node.sibling) && isConsistentDegree(node.child);
    }

    private int countChildNodes(BinomialHeapNode node) {
        if (node == null)
            return 0;
    
        return 1 + countChildNodes(node.child);
    }

    private boolean noDuplicateKeys() {
        Set<Integer> keys = new HashSet<>();
        return noDuplicateKeys(Nodes, keys);
    }

    private boolean noDuplicateKeys(BinomialHeapNode node, Set<Integer> keys) {
        if (node == null)
            return true;
    
        if (keys.contains(node.key))
            return false;
    
        keys.add(node.key);
    
        return noDuplicateKeys(node.sibling, keys) && noDuplicateKeys(node.child, keys);
    }


}
