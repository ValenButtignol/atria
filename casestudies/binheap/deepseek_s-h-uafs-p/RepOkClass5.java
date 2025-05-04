public class RepOkClass5 {
    public boolean property_5() {
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
