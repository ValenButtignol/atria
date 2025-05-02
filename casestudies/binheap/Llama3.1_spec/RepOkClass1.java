public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check if all nodes have a degree of 0 or more
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (temp.degree < 0) {
                return false;
            }
            temp = temp.sibling;
        }
    
        // Check if all nodes are connected in a way that satisfies the binomial heap property
        temp = Nodes;
        while (temp != null) {
            BinomialHeapNode nextTemp = temp.sibling;
            while (nextTemp != null) {
                if (temp.degree != nextTemp.degree
                        || (nextTemp.sibling != null && nextTemp.sibling.degree == temp.degree)) {
                    return false;
                }
                nextTemp = nextTemp.sibling;
            }
            temp = temp.sibling;
        }
    
        // Check if the size attribute is equal to the number of elements in the heap
        return size == Nodes.size();
    }


}
