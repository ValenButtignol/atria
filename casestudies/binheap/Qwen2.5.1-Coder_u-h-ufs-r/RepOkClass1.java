public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null && size != 0)
            return false;
    
        if (size != Nodes.size())
            return false;
    
        if (!isAcyclic())
            return false;
    
        if (!isMinHeap())
            return false;
    
        return true;
    }

    private boolean isAcyclic() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        return isAcyclicHelper(Nodes, visited);
    }

    private boolean isAcyclicHelper(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null)
            return true;
    
        if (!visited.add(node))
            return false;
    
        if (!isAcyclicHelper(node.child, visited))
            return false;
    
        if (!isAcyclicHelper(node.sibling, visited))
            return false;
    
        return true;
    }

    private boolean isMinHeap() {
        return isMinHeapHelper(Nodes);
    }

    private boolean isMinHeapHelper(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.child != null && node.key > node.child.key)
            return false;
    
        if (!isMinHeapHelper(node.child))
            return false;
    
        if (!isMinHeapHelper(node.sibling))
            return false;
    
        return true;
    }


}
