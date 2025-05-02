public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check each node's parent, sibling, and child relationships
        for (BinomialHeapNode node : Nodes) {
            if (node.parent != null && node.parent.sibling != null && node.parent.sibling.key <= node.key) {
                return false;
            }
            if (node.sibling != null && node.sibling.key >= node.key) {
                return false;
            }
            if (node.child != null && node.child.parent != node) {
                return false;
            }
        }
    
        // Check the heap property (min-heap)
        BinomialHeapNode minNode = findMinNode();
        if (minNode == null) {
            return true;
        }
        if (minNode.sibling != null && minNode.sibling.key < minNode.key) {
            return false;
        }
    
        // Check the size
        if (size != Nodes.size()) {
            return false;
        }
    
        // Check the structure of binomial trees
        int expectedSize = 1;
        int currentOrder = 0;
        while (expectedSize <= size) {
            currentOrder++;
            expectedSize += Math.pow(2, currentOrder);
        }
        expectedSize = (int) Math.pow(2, currentOrder);
    
        if (size != expectedSize) {
            return false;
        }
    
        return true;
    }


}
