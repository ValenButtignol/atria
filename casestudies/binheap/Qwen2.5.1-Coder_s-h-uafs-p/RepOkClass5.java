public class RepOkClass5{
    public boolean property_5() {
        return checkDegree(Nodes);
    }

    private boolean checkDegree(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        if (node.degree < 0) {
            return false;
        }
        return checkDegree(node.sibling) && checkDegree(node.child);
    }


}
