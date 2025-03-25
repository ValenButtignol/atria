public class RepOkClass1{
    public boolean repOK() {
        if (size == 0)
            return true;
    
        if (Nodes == null)
            return false;
    
        if (!isAcyclic(Nodes))
            return false;
    
        if (!isOrdered(Nodes))
            return false;
    
        if (!hasNoDuplicates(Nodes))
            return false;
    
        return true;
    }

    private boolean isAcyclic(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.sibling != null && !isAcyclic(node.sibling))
            return false;
    
        return isAcyclic(node.parent) && isAcyclic(node.sibling);
    }

    private boolean isOrdered(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.parent != null && node.key <= node.parent.key)
            return false;
    
        return isOrdered(node.left) && isOrdered(node.right);
    }

    private boolean hasNoDuplicates(BinomialHeapNode node) {
        if (node == null)
            return true;
    
        if (node.findANodeWithKey(node.key) != null)
            return false;
    
        return hasNoDuplicates(node.left) && hasNoDuplicates(node.right);
    }


}
