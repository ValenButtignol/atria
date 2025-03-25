public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null) {
            return size == 0;
        }
    
        if (Nodes.key < 0) {
            return false;
        }
    
        if (Nodes.degree < 0) {
            return false;
        }
    
        if (Nodes.parent != null && Nodes.parent.degree < Nodes.degree) {
            return false;
        }
    
        if (Nodes.sibling != null && Nodes.sibling.degree < Nodes.degree) {
            return false;
        }
    
        if (Nodes.child != null && Nodes.child.degree < Nodes.degree) {
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
            temp = temp.sibling;
        }
    
        temp = Nodes;
        while (temp != null) {
            if (temp.child != null) {
                if (temp.child.key < 0) {
                    return false;
                }
                if (temp.child.degree < 0) {
                    return false;
                }
                if (temp.child.parent != null && temp.child.parent.degree < temp.child.degree) {
                    return false;
                }
                if (temp.child.sibling != null && temp.child.sibling.degree < temp.child.degree) {
                    return false;
                }
                if (temp.child.child != null && temp.child.child.degree < temp.child.degree) {
                    return false;
                }
            }
            temp = temp.sibling;
        }
    
        return true;
    }


}
