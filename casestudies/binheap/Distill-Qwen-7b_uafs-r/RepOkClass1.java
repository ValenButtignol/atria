public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check that each tree in Nodes satisfies the min-heap property
        for (BinomialHeapNode node : Nodes) {
            if (!node.isMinHeap()) {
                return false;
            }
        }
    
        // Check that the size is consistent with the sum of subtree sizes
        int expectedSize = 0;
        for (BinomialHeapNode node : Nodes) {
            expectedSize += node.size();
        }
        if (expectedSize != size) {
            return false;
        }
    
        // Ensure the structure corresponds to the binary representation of the size
        int expectedDegree = Integer.numberOfTrailingZeros(size | -size);
        if (expectedDegree != Nodes.size() - 1) {
            return false;
        }
    
        // Ensure there's at least one tree if the heap is not empty
        if (!Nodes.isEmpty() && size == 0) {
            return false;
        }
    
        // Ensure the root is the minimum key
        if (!Nodes.isEmpty()) {
            BinomialHeapNode root = Nodes.first();
            for (BinomialHeapNode node : Nodes) {
                if (node.key < root.key) {
                    return false;
                }
            }
        }
    
        return true;
    }


}
