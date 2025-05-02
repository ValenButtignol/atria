public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        }
        
        // Check each node's degree and parent relationships
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current.parent != null && current.parent.degree != current.getDegree() - 1) {
                return false;
            }
            current = current.sibling;
        }
        
        // Check the root's degree
        BinomialHeapNode root = Nodes;
        while (root != null && root.sibling != null) {
            root = root.sibling;
        }
        if (root != null) {
            int expectedDegree = 0;
            while (expectedDegree < root.getDegree()) {
                expectedDegree++;
                if (root.sibling != null && root.sibling.getDegree() >= expectedDegree) {
                    return false;
                }
            }
        }
        
        return true;
    }


}
