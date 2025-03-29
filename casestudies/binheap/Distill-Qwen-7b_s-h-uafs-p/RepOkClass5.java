public class RepOkClass5{
    public boolean property() {
        if (Nodes == null) {
            return true;
        }
    
        BinomialHeapNode current = Nodes;
        while (current != null) {
            int degree = current.getDegree();
            int key = current.getKey();
    
            // Check if the current node's degree is correct
            if (degree != expectedDegree(current)) {
                return false;
            }
    
            // Check if the parent has a higher degree
            if (current.getParent() != null && current.getParent().getDegree() <= degree) {
                return false;
            }
    
            // Check if the children are correctly linked
            if (current.getSibling() != null && (current.getSibling().getDegree() != degree + 1)) {
                return false;
            }
    
            // Check the heap property
            if (current.getKey() != findMinNode().getKey) {
                return false;
            }
    
            current = current.getSibling();
        }
    
        return true;
    }


}
