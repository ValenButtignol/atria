public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != Nodes.size()) {
            return false;
        }
    
        // Check each node's parent key and degree
        BinomialHeapNode current = Nodes;
        while (current != null) {
            // Check parent key
            if (current.parent != null) {
                if (current.parent.key > current.key) {
                    return false;
                }
            }
    
            // Check degree
            if (current.degree > 2) {
                return false;
            }
    
            current = current.sibling;
        }
    
        return true;
    }


}
