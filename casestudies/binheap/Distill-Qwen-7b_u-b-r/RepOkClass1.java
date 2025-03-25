public class RepOkClass1{
        public boolean repOK() {
            if (Nodes == null) {
                return size == 0;
            }
    
            // Check that the size matches the number of nodes.
            if (size != Nodes.size()) {
                return false;
            }
    
            // Check that the root has the minimum key.
            BinomialHeapNode root = Nodes;
            if (root == null) {
                return true;
            }
            if (root.findMinNode() != root) {
                return false;
            }
    
            // Check that all nodes have valid degrees and structure.
            BinomialHeapNode current = root;
            while (current != null) {
                if (current.getDegree() < 0 || current.getDegree() > Math.log(current.size(), 2)) {
                    return false;
                }
                current = current.sibling;
            }
    
            return true;
        }


}
