public class RepOkClass1 {
    public boolean property() {
        if (Nodes == null) {
            return true;
        }
        return checkHeapProperty(Nodes);
    }
    
    private boolean checkHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null && node.child.key < node.key) {
            return false;
        }
        if (node.sibling != null && node.sibling.key < node.key) {
            return false;
        }
        return checkHeapProperty(node.child) && checkHeapProperty(node.sibling);
    }
}
