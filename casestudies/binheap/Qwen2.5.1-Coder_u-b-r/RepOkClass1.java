public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the root node is null or points to a valid binomial tree
        if (Nodes != null && !Nodes.isBinomialTree()) {
            return false;
        }
    
        // Check if the size matches the actual number of nodes in the heap
        if (size != countNodes(Nodes)) {
            return false;
        }
    
        // Check if the heap property is maintained
        if (!isHeapProperty(Nodes)) {
            return false;
        }
    
        // Check if the sibling links are correctly ordered
        if (!areSiblingsOrdered(Nodes)) {
            return false;
        }
    
        // Check if the degree of each node is non-negative
        if (!areDegreesNonNegative(Nodes)) {
            return false;
        }
    
        // Check if the parent pointers are correctly set
        if (!areParentPointersCorrect(Nodes)) {
            return false;
        }
    
        // Check if the child pointers are correctly set
        if (!areChildPointersCorrect(Nodes)) {
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

    private boolean isHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null && node.key > node.child.key) {
            return false;
        }
        return isHeapProperty(node.sibling) && isHeapProperty(node.child);
    }

    private boolean areSiblingsOrdered(BinomialHeapNode node) {
        if (node == null || node.sibling == null) {
            return true;
        }
        return node.degree <= node.sibling.degree && areSiblingsOrdered(node.sibling);
    }

    private boolean areDegreesNonNegative(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        return node.degree >= 0 && areDegreesNonNegative(node.sibling) && areDegreesNonNegative(node.child);
    }

    private boolean areParentPointersCorrect(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null) {
            if (node.child.parent != node) {
                return false;
            }
            return areParentPointersCorrect(node.child) && areParentPointersCorrect(node.sibling);
        }
        return areParentPointersCorrect(node.sibling);
    }

    private boolean areChildPointersCorrect(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null) {
            if (node.child.parent != node) {
                return false;
            }
            return areChildPointersCorrect(node.child) && areChildPointersCorrect(node.sibling);
        }
        return areChildPointersCorrect(node.sibling);
    }


}
