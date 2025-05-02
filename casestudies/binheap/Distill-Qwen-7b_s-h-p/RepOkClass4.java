public class RepOkClass4{
    public boolean property_4() {
        if (Nodes == null) {
            return true;
        }
        return isBinomialTree(Nodes);
    }

    private boolean isBinomialTree(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.degree != node.size() - 1) {
            return false;
        }
        for (BinomialHeapNode child : node.children) {
            if (!isBinomialTree(child)) {
                return false;
            }
        }
        return true;
    }


}
