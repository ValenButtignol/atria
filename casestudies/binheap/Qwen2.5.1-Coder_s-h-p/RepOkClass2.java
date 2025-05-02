public class RepOkClass2{
    public boolean property_2() {
        return size >= 0 && size == countNodes(Nodes);
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.child) + countNodes(node.sibling);
    }


}
