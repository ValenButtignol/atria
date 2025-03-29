public class RepOkClass4{
    public boolean property() {
        Set<Integer> keys = new HashSet<Integer>();
        BinomialHeapNode temp = Nodes;
        while (temp != null) {
            if (keys.contains(temp.key)) {
                return false;
            }
            keys.add(temp.key);
            temp = temp.sibling;
        }
        return true;
    }


}
