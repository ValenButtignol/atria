public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
    
        if (Nodes == null) {
            return size == 0;
        }
    
        if (Nodes.degree < 0) {
            return false;
        }
    
        if (Nodes.parent != null) {
            return false;
        }
    
        if (Nodes.sibling != null && Nodes.sibling.parent != null) {
            return false;
        }
    
        if (Nodes.child != null && Nodes.child.parent != Nodes) {
            return false;
        }
    
        if (Nodes.child != null && Nodes.child.degree != 0) {
            return false;
        }
    
        if (Nodes.sibling != null && !repOK_1(Nodes.sibling)) {
            return false;
        }
    
        if (Nodes.child != null && !repOK_1(Nodes.child)) {
            return false;
        }
    
        return true;
    }

    private boolean repOK_1(BinomialHeapNode node) {
        if (node.degree < 0) {
            return false;
        }
    
        if (node.parent != null && node.parent.degree <= node.degree) {
            return false;
        }
    
        if (node.sibling != null && node.sibling.parent != null) {
            return false;
        }
    
        if (node.child != null && node.child.parent != node) {
            return false;
        }
    
        if (node.child != null && node.child.degree != node.degree - 1) {
            return false;
        }
    
        if (node.sibling != null && !repOK_1(node.sibling)) {
            return false;
        }
    
        if (node.child != null && !repOK_1(node.child)) {
            return false;
        }
    
        return true;
    }


}
