public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is correct
        if (size < 0) return false;
        if (size == 0) {
            if (Nodes != null) return false;
            return true;
        }
    
        // Check if the root node exists
        if (Nodes == null) return false;
    
        // Check the heap property
        BinomialHeapNode root = Nodes;
        if (root == null) return false;
    
        // Check the root's key
        if (root.key != Integer.MIN_VALUE) return false;
    
        // Check the root's children
        BinomialHeapNode leftChild = root.child;
        BinomialHeapNode rightChild = root.sibling;
    
        if (leftChild != null) {
            if (leftChild.parent != root) return false;
            if (leftChild.key > root.key) return false;
        }
    
        if (rightChild != null) {
            if (rightChild.parent != root) return false;
            if (rightChild.key > root.key) return false;
        }
    
        // Check the size
        if (size != (1 + (leftChild != null ? leftChild.size() : 0) + (rightChild != null ? rightChild.size() : 0))) {
            return false;
        }
    
        return true;
    }


}
