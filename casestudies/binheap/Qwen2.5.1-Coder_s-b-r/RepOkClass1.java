public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is non-negative
        if (size < 0) {
            return false;
        }
    
        // Check if the root node is null or has the correct properties
        if (Nodes != null) {
            // Check if the root node is a valid binomial tree
            if (!Nodes.isBinomialTree()) {
                return false;
            }
    
            // Check if the root node's degree is within the valid range
            if (Nodes.degree < 0) {
                return false;
            }
    
            // Check if the root node's sibling is null or has the correct properties
            if (Nodes.sibling != null) {
                if (!Nodes.sibling.isBinomialTree()) {
                    return false;
                }
    
                if (Nodes.degree >= Nodes.sibling.degree) {
                    return false;
                }
            }
    
            // Check if the root node's child is null or has the correct properties
            if (Nodes.child != null) {
                if (!Nodes.child.isBinomialTree()) {
                    return false;
                }
    
                if (Nodes.degree != Nodes.child.degree) {
                    return false;
                }
            }
        }
    
        // Check if the size matches the number of nodes in the heap
        if (size != countNodes(Nodes)) {
            return false;
        }
    
        return true;
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.sibling) + countNodes(node.child);
    }

    private boolean isBinomialTree(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        // Check if the node's degree is non-negative
        if (node.degree < 0) {
            return false;
        }
    
        // Check if the node's child is null or has the correct properties
        if (node.child != null) {
            if (!node.child.isBinomialTree()) {
                return false;
            }
    
            if (node.degree != node.child.degree) {
                return false;
            }
        }
    
        // Check if the node's sibling is null or has the correct properties
        if (node.sibling != null) {
            if (!node.sibling.isBinomialTree()) {
                return false;
            }
    
            if (node.degree >= node.sibling.degree) {
                return false;
            }
        }
    
        // Check if the heap property holds for the node
        if (node.child != null) {
            BinomialHeapNode child = node.child;
            while (child != null) {
                if (child.key > node.key) {
                    return false;
                }
                child = child.sibling;
            }
        }
    
        return true;
    }


}
