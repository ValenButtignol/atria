public class RepOkClass4{
    public boolean property() {
        return checkParentKeys(Nodes, null);
    }

    private boolean checkParentKeys(BinomialHeapNode node, BinomialHeapNode parent) {
        if (node != null) {
            if (parent != null && node.key < parent.key) {
                return false;
            }
            if (!checkParentKeys(node.child, node)) {
                return false;
            }
            if (!checkParentKeys(node.sibling, parent)) {
                return false;
            }
        }
        return true;
    }


}
