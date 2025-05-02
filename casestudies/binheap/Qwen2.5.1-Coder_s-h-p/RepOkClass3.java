public class RepOkClass3{
    public boolean property_3() {
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
