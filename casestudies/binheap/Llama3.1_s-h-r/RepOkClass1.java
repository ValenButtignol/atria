public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        } else {
            BinomialHeapNode temp = Nodes;
            while (temp != null) {
                if (temp.degree < 0) {
                    return false;
                }
                temp = temp.sibling;
            }
            return true;
        }
    }


}
