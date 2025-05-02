public class RepOkClass2{
    public boolean property_2() {
        return (Nodes == null) ? (size == 0) : (countNodes(Nodes) == size);
    }

    private int countNodes(BinomialHeapNode node) {
        if (node == null)
            return 0;
        int count = 1;
        count += countNodes(node.child);
        count += countNodes(node.sibling);
        return count;
    }


}
