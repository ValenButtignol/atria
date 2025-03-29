public class RepOkClass4{
    public boolean property() {
        if (Nodes == null) {
            return true;
        } else {
            int minViaMethod = findMinimum();
            BinomialHeapNode minNode = Nodes.findMinNode();
            int minViaTraversal = minNode.key;
            return minViaMethod == minViaTraversal;
        }
    }


}
