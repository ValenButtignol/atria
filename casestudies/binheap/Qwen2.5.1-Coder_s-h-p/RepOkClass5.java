public class RepOkClass5{
    public boolean property() {
        if (Nodes == null) {
            return true;
        }
    
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current.parent != null && current.parent.child != current) {
                return false;
            }
            current = current.sibling;
        }
    
        return true;
    }


}
