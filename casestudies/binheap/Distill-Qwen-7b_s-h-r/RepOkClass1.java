public class RepOkClass1{
    public boolean repOK() {
        int expectedSize = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            expectedSize += current.size();
            current = current.sibling;
        }
        if (expectedSize != size) {
            throw new IllegalStateException("Size mismatch: expected " + expectedSize + ", got " + size);
        }
        
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current != current.parent) {
                throw new IllegalStateException("Invalid parent relationship");
            }
            if (current != current.child) {
                throw new IllegalStateException("Invalid child relationship");
            }
            if (current != current.sibling) {
                throw new IllegalStateException("Invalid sibling relationship");
            }
            current = current.sibling;
        }
        
        return true;
    }


}
