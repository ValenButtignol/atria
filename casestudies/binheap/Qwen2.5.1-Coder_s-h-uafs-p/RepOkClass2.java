public class RepOkClass2{
    public boolean property_2() {
        int count = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            count += current.size();
            current = current.sibling;
        }
        return count == size;
    }


}
