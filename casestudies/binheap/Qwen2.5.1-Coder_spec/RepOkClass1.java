public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the root node is null or satisfies the binomial heap property
        if (Nodes != null) {
            if (!isBinomialHeap(Nodes)) {
                return false;
            }
        }
    
        // Check if the size matches the number of nodes in the heap
        if (size != countNodes(Nodes)) {
            return false;
        }
    
        return true;
    }

    private boolean isBinomialHeap(BinomialHeapNode node) {
        // Check if the node is a valid binomial tree
        if (node == null) {
            return true;
        }
    
        // Check if the degree of the node is non-negative
        if (node.degree < 0) {
            return false;
        }
    
        // Check if the key of the node is less than or equal to the keys of its children
        if ((node.child != null) && (node.key > node.child.key)) {
            return false;
        }
    
        // Check if the sibling nodes are valid binomial trees
        if ((node.sibling != null) && (node.degree >= node.sibling.degree)) {
            return false;
        }
    
        // Recursively check the children and siblings
        return isBinomialHeap(node.child) && isBinomialHeap(node.sibling);
    }

    private int countNodes(BinomialHeapNode node) {
        // Count the number of nodes in the heap
        if (node == null) {
            return 0;
        }
    
        return 1 + countNodes(node.child) + countNodes(node.sibling);
    }


}
