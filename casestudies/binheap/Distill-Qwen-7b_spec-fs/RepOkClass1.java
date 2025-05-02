public class RepOkClass1{
    public boolean repOK_1() {
        if (size != Nodes.size()) {
            return false;
        }
    
        if (!isMinHeap()) {
            return false;
        }
    
        if (!isAcyclic()) {
            return false;
        }
    
        if (!isBinomialTreeStructure()) {
            return false;
        }
    
        if (Nodes != null && Nodes.key == null) {
            return false;
        }
    
        return true;
    }

    private boolean isMinHeap() {
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current.key > current.child.key) {
                return false;
            }
            current = current.child;
        }
        return true;
    }

    private boolean isAcyclic() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            current = current.sibling;
        }
        return true;
    }

    private boolean isBinomialTreeStructure() {
        int expectedDegree = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current.getDegree() != expectedDegree) {
                return false;
            }
            expectedDegree++;
            current = current.child;
        }
        return true;
    }


}
