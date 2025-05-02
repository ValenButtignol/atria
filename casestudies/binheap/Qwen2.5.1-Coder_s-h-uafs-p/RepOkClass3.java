public class RepOkClass3{
    public boolean property_3() {
        Set<BinomialHeapNode> visited = new HashSet<BinomialHeapNode>();
        visited.add(Nodes);
        LinkedList<BinomialHeapNode> workList = new LinkedList<BinomialHeapNode>();
        workList.add(Nodes);
        while (!workList.isEmpty()) {
            BinomialHeapNode current = (BinomialHeapNode) workList.removeFirst();
            if (current.child != null) {
                if (!visited.add(current.child))
                    return false;
                workList.add(current.child);
            }
            if (current.sibling != null) {
                if (!visited.add(current.sibling))
                    return false;
                workList.add(current.sibling);
            }
        }
        return true;
    }


}
