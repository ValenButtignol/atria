public class RepOkClass1{
    public boolean repOK_1() {
        // Check if Nodes is null when size is zero
        if (size != 0 && Nodes == null) {
            return false;
        }
    
        // Check if size matches the number of nodes
        if (size != Nodes.size()) {
            return false;
        }
    
        // Check if the tree structure is valid
        if (Nodes != null) {
            BinomialHeapNode root = Nodes;
            BinomialHeapNode prev = null;
            while (root != null) {
                // Check parent and child relationships
                if (root.parent != null && root.parent != prev) {
                    prev = root.parent;
                } else {
                    prev = null;
                }
                // Check sibling relationships
                if (root.sibling != null && root.sibling != prev) {
                    prev = root.sibling;
                } else {
                    prev = null;
                }
                root = root.sibling;
            }
        }
    
        return true;
    }


}
