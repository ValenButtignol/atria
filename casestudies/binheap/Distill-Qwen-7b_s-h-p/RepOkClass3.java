public class RepOkClass3{
    public boolean property_3() {
        if (Nodes == null) {
            return true;
        }
    
        BinomialHeapNode root = Nodes;
        while (root != null) {
            if (root.child != null && root.child.key < root.key) {
                return false;
            }
            if (root.sibling != null && root.sibling.key < root.key) {
                return false;
            }
            root = root.sibling;
        }
    
        return true;
    }


}
