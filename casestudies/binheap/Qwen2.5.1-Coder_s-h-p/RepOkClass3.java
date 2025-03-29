public class RepOkClass3{
    public boolean property() {
        if (Nodes == null) {
            return true;
        }
        BinomialHeapNode minNode = Nodes.findMinNode();
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (temp.key < minNode.key) {
                return false;
            }
            temp = temp.sibling;
        }
        return true;
    }


}
