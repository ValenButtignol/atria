public class RepOkClass4{
    public boolean property_4() {
        return checkMinHeapProperty(Nodes);
    }

    private boolean checkMinHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.child != null) {
            BinomialHeapNode child = node.child;
            while (child != null) {
                if (node.key > child.key) {
                    return false;
                }
                if (!checkMinHeapProperty(child)) {
                    return false;
                }
                child = child.sibling;
            }
        }
        return true;
    }


}
