public class RepOkClass3{
    public boolean property_3() {
        int sum = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            sum += current.size();
            current = current.sibling;
        }
        return sum == size;
    }


}
