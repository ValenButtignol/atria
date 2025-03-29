public class RepOkClass4{
    public boolean property() {
        if (Nodes == null) {
            return size == 0;
        } else {
            BinomialHeapNode temp = Nodes;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.sibling;
            }
            return count == size;
        }
    }


}
