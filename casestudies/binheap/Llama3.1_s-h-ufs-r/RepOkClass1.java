public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        }
    
        if (Nodes.findMinNode() == null) {
            return false;
        }
    
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (temp.key < 0) {
                return false;
            }
            if (temp.degree < 0) {
                return false;
            }
            if (temp.parent != null && temp.parent.key >= temp.key) {
                return false;
            }
            if (temp.sibling != null && temp.sibling.key < temp.key) {
                return false;
            }
            temp = temp.sibling;
        }
    
        return true;
    }


}
