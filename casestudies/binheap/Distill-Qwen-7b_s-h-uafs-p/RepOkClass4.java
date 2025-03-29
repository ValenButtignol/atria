public class RepOkClass4{
    public boolean property() {
        if (size == 0) {
            return true;
        }
    
        Set<Integer> rootKeys = new HashSet<>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            rootKeys.add(current.key);
            current = current.sibling;
        }
    
        int minRootKey = rootKeys.stream().min(Integer::compare).orElseThrow();
        BinomialHeapNode minNode = findMinNode();
        return minRootKey == minNode.key;
    }


}
