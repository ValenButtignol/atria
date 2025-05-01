public class RepOkClass5 {
    public boolean property() {
        Set<Integer> degrees = new HashSet<Integer>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (degrees.contains(current.degree)) {
                return false;
            }
            degrees.add(current.degree);
            current = current.sibling;
        }
        return true;
    }
}
