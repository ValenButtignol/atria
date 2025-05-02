public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check if all nodes in the heap are valid
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (temp.key < 0) {
                return false;
            }
            if (temp.degree < 0) {
                return false;
            }
            if (temp.parent != null && temp.parent.degree < temp.degree) {
                return false;
            }
            if (temp.sibling != null && temp.sibling.degree == temp.degree) {
                return false;
            }
            if (temp.child != null && temp.child.parent != temp) {
                return false;
            }
            temp = temp.sibling;
        }
    
        // Check if the heap satisfies the binomial heap property
        temp = Nodes;
        while (temp != null) {
            BinomialHeapNode nextTemp = temp.sibling;
            while (nextTemp != null) {
                if (temp.degree == nextTemp.degree || (nextTemp.sibling != null && nextTemp.sibling.degree == temp.degree)) {
                    if (temp.key <= nextTemp.key) {
                        if (nextTemp.parent != null && nextTemp.parent != temp) {
                            return false;
                        }
                        if (nextTemp.sibling != null && nextTemp.sibling != temp.child) {
                            return false;
                        }
                    } else {
                        if (temp.parent != null && temp.parent != nextTemp) {
                            return false;
                        }
                        if (temp.sibling != null && temp.sibling != nextTemp.child) {
                            return false;
                        }
                    }
                }
                nextTemp = nextTemp.sibling;
            }
            temp = temp.sibling;
        }
    
        // Check if the size of the heap is correct
        return size == Nodes.size();
    }


}
