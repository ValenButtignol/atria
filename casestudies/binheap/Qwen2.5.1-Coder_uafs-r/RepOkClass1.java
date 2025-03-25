public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null)
            return size == 0;
    
        if (size != Nodes.size())
            return false;
    
        if (!isHeap())
            return false;
    
        if (!noCycles())
            return false;
    
        return true;
    }

    private boolean isHeap() {
        return isHeap(Nodes);
    }

    private boolean isHeap(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.child != null && node.key > node.child.key)
            return false;
    
        return isHeap(node.sibling) && isHeap(node.child);
    }

    private boolean noCycles() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return noCycles(Nodes, visited);
    }

    private boolean noCycles(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null)
            return true;
    
        if (!visited.add(node))
            return false;
    
        return noCycles(node.child, visited) && noCycles(node.sibling, visited);
    }


}
