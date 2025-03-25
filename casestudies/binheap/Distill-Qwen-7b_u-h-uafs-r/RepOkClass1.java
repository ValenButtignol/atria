public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check each tree in the heap
        while (Nodes != null) {
            BinomialHeapNode current = Nodes;
            Nodes = current.sibling;
    
            if (current == null) {
                continue;
            }
    
            // Check if the tree is valid
            if (!isBinomialTree(current)) {
                return false;
            }
    
            // Check the min-heap property
            if (!minHeapProperty(current)) {
                return false;
            }
        }
    
        // Check the size
        if (size != Nodes.size()) {
            return false;
        }
    
        return true;
    }

    private boolean isBinomialTree(BinomialHeapNode node) {
        // A tree is valid if it's a single node or has children that are valid binomial trees of degree one less
        if (node == null || node.degree == 0) {
            return true;
        }
    
        if (node.sibling == null) {
            return false;
        }
    
        if (node.sibling != null && node.sibling != node.child) {
            return false;
        }
    
        for (int i = 0; i <= node.degree; i++) {
            if (node.findANodeWithKey(i) == null) {
                return false;
            }
        }
    
        return true;
    }

    private boolean minHeapProperty(BinomialHeapNode node) {
        if (node == null || node.child == null) {
            return true;
        }
    
        if (node.key > node.child.key) {
            return false;
        }
    
        return minHeapProperty(node.child);
    }


}
