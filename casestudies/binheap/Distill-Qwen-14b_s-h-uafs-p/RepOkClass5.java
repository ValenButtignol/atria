public class RepOkClass5{
    public boolean property() {
        if (Nodes == null) {
            return true;
        }
        int minKey = Nodes.key;
        Queue<BinomialHeapNode> queue = new LinkedList<>();
        queue.add(Nodes);
        while (!queue.isEmpty()) {
            BinomialHeapNode current = queue.remove();
            if (current.key < minKey) {
                minKey = current.key;
            }
            if (current.child != null) {
                queue.add(current.child);
            }
            if (current.sibling != null) {
                queue.add(current.sibling);
            }
        }
        return minKey == Nodes.key;
    }


}
