public class RepOkClass4{
    public boolean property_4() {
        return checkNodeStructure(Nodes);
    }

    private boolean checkNodeStructure(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.degree < 0) {
            return false;
        }
        if (node.child != null && node.child.degree != node.degree - 1) {
            return false;
        }
        return checkNodeStructure(node.sibling) && checkNodeStructure(node.child);
    }


}
