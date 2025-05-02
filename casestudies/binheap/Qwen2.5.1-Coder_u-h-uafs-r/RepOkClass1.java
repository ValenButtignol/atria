public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (Nodes == null && size != 0) {
            return false;
        }
    
        if (Nodes != null && !isHeapPropertySatisfied(Nodes)) {
            return false;
        }
    
        if (Nodes != null && !isAcyclic(Nodes)) {
            return false;
        }
    
        if (Nodes != null && !isCorrectDegree(Nodes)) {
            return false;
        }
    
        return true;
    }

    private boolean isHeapPropertySatisfied(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.child != null && node.key > node.child.key) {
            return false;
        }
    
        return isHeapPropertySatisfied(node.sibling) && isHeapPropertySatisfied(node.child);
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
    
        return isAcyclicHelper(node.child, visited) && isAcyclicHelper(node.sibling, visited);
    }

    private boolean isCorrectDegree(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.degree < 0) {
            return false;
        }
    
        return isCorrectDegree(node.sibling) && isCorrectDegree(node.child);
    }


}
