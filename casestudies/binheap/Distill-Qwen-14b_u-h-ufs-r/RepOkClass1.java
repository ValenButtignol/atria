public class RepOkClass1{
    public boolean repOK() {
        // Check size consistency
        int total = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            total += current.size();
            current = current.sibling;
       

}
