public class RepOkClass1 {
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (Nodes == null) {
            return size == 0;
        }
    
        if (Nodes.size() != size) {
            return false;
        }
    
        if (!isHeapValid(Nodes)) {
            return false;
        }
    
        return true;
    }
    
    private boolean isHeapValid(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        if (node.parent != null && node.key < node.parent.key) {
            return false;
        }
    
        if (node.child != null && !isHeapValid(node.child)) {
            return false;
        }
    
        if (node.sibling != null && !isHeapValid(node.sibling)) {
            return false;
        }
    
        return true;
    }
}
