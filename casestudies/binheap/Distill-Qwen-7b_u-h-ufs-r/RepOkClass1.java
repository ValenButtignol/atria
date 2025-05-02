public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        }
    
        int numNodes = Nodes.numNodes();
        if (numNodes != size) {
            return false;
        }
    
        BinomialHeapNode minNode = Nodes.findMinNode();
        if (minNode != null && minNode.key != findMinimum()) {
            return false;
        }
    
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (temp.degree != temp.child != null ? temp.child.size() : 0) {
                return false;
            }
            if (temp != Nodes && temp.parent != null && temp.parent.degree != temp.degree + 1) {
                return false;
            }
            temp = temp.child;
        }
    
        for (BinomialHeapNode node : Nodes) {
            if (node != null && node.key < 0) {
                return false;
            }
        }
    
        return true;
    }


}
