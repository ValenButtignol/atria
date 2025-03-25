public class RepOkClass1{
    public boolean repOK() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check if the heap is not empty
        if (size > 0) {
            // Check if all nodes have a valid key
            BinomialHeapNode temp = Nodes;
            while (temp != null) {
                if (temp.key < 0) {
                    return false;
                }
                temp = temp.sibling;
            }
    
            // Check if all nodes have a valid degree
            temp = Nodes;
            while (temp != null) {
                if (temp.degree < 0) {
                    return false;
                }
                temp = temp.sibling;
            }
    
            // Check if all nodes are properly linked
            temp = Nodes;
            while (temp != null) {
                BinomialHeapNode child = temp.child;
                while (child != null) {
                    if (child.parent != temp) {
                        return false;
                    }
                    child = child.sibling;
                }
                temp = temp.sibling;
            }
    
            // Check if all nodes are properly ordered
            temp = Nodes;
            while (temp != null) {
                BinomialHeapNode sibling = temp.sibling;
                while (sibling != null) {
                    if (temp.degree < sibling.degree || (temp.degree == sibling.degree && temp.key <= sibling.key)) {
                        return false;
                    }
                    sibling = sibling.sibling;
                }
                temp = temp.sibling;
            }
        }
    
        return true;
    }


}
