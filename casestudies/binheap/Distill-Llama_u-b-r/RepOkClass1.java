public class RepOkClass1{
    public boolean repOK_1() {
        // Check if Nodes is null and size is 0
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check size consistency
        int actualSize = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            actualSize++;
            current = current.sibling;
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check parent pointers
        current = Nodes;
        while (current != null) {
            if (current.parent == null && current != Nodes) {
                // Root node should have parent null
                return false;
            }
            if (current.parent != null && current != Nodes) {
                // Ensure parent is not null for non-root nodes
                current = current.parent;
            } else {
                // Move to next node
                current = current.sibling;
            }
        }
    
        // Check child pointers
        current = Nodes;
        while (current != null) {
            if (current.child != null && current != Nodes) {
                // Ensure each node has at most one child
                return false;
            }
            current = current.child;
        }
    
        return true;
    }


}
