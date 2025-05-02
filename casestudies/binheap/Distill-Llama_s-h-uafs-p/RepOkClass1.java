public class RepOkClass1{
    public boolean property_1() {
        int actualSize = countNodes(Nodes);
        return actualSize == size;
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
