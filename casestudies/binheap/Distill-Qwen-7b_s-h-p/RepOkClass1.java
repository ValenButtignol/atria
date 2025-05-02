public class RepOkClass1{
    public boolean property_1() {
        if (Nodes == null) {
            return true;
        }
        
        BinomialHeapNode current = Nodes;
        while (current != null) {
            int expectedDegree = (int) (Math.log(current.key + 1) / Math.log(2));
            if (current.getDegree() != expectedDegree) {
                return false;
            }
            current = current.sibling;
        }
        
        return true;
    }


}
