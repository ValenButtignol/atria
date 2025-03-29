public class RepOkClass1{
    public boolean repOK() {
        if (size < 0)
            return false;
    
        if (size == 0)
            return Nodes == null;
    
        if (Nodes == null)
            return false;
    
        if (!isHeapPropertyMaintained())
            return false;
    
        if (!isAcyclic())
            return false;
    
        if (!isSizeConsistent())
            return false;
    
        if (!isDegreeConsistent())
            return false;
    
        if (!hasNoDuplicateKeys())
            return false;
    
        return true;
    }

    private boolean isHeapPropertyMaintained() {
        return isHeapPropertyMaintained(Nodes);
    }

    private boolean isHeapPropertyMaintained(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.child != null) {
            if (node.key < node.child.key)
                return false;
        }
    
        return isHeapPropertyMaintained(node.sibling);
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

    private boolean isSizeConsistent() {
        return size == countNodes(Nodes);
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null)
            return 0;
    
        return 1 + countNodes(node.sibling) + countNodes(node.child);
    }

    private boolean isDegreeConsistent() {
        BinomialHeapNode node = Nodes;
        while (node != null) {
            if (node.degree != countChildren(node))
                return false;
    
            node = node.sibling;
        }
    
        return true;
    }

    private int countChildren(BinomialHeapNode node) {
        if (node == null)
            return 0;
    
        return 1 + countChildren(node.child);
    }

    private boolean hasNoDuplicateKeys() {
        Set<Integer> keys = new HashSet<>();
        return hasNoDuplicateKeys(Nodes, keys);
    }

    private boolean hasNoDuplicateKeys(BinomialHeapNode node, Set<Integer> keys) {
        if (node == null)
            return true;
    
        if (keys.contains(node.key))
            return false;
    
        keys.add(node.key);
    
        return hasNoDuplicateKeys(node.sibling, keys);
    }


}
