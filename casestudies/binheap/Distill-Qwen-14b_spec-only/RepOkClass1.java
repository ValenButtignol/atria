public class RepOkClass1{
    public boolean repOK() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        } else {
            if (size == 0) {
                return false; // Heap is not empty but size is 0
            }
        }
    
        // Check that the root's key is the minimum
        BinomialHeapNode minNode = findMinimum();
        if (minNode == null) {
            return false; // Heap is not empty but findMinimum returned null
        }
        if (Nodes.key != minNode.key) {
            return false;
        }
    
        // Check the heap property for all nodes
        if (!checkHeapProperty(Nodes)) {
            return false;
        }
    
        // Check that the size is correct
        int actualSize = countNodes(Nodes);
        if (actualSize != size) {
            return false;
        }
    
        return true;
    }

    private boolean checkHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.parent != null && node.key > node.parent.key) {
            return false;
        }
        for (BinomialHeapNode child : node.children) {
            if (!checkHeapProperty(child)) {
                return false;
            }
        }
        return true;
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        int count = 1;
        for (BinomialHeapNode child : node.children) {
            count += countNodes(child);
        }
        return count;
    }


}
