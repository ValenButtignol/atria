public class RepOkClass2 {
    public boolean property_2() {
        BinomialHeapNode current = Nodes;
        while (current != null && current.sibling != null) {
            if (current.degree >= current.sibling.degree) {
                return false;
            }
            current = current.sibling;
        }
        return true;
    }
}
