public class RepOkClass3{
    public boolean property_3() {
        return checkHeapProperty(Nodes);
    }

    private boolean checkHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null) {
            if (node.key <= node.child.getKey()) {
                return false;
            }
            return checkHeapProperty(node.child) && checkHeapProperty(node.child.sibling);
        }
        BinomialHeapNode sibling = node.sibling;
        while (sibling != null) {
            if (node.key <= sibling.getKey()) {
                return false;
            }
            sibling = sibling.sibling;
        }
        return true;
    }


}
