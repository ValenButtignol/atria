public class RepOkClass2{
    public boolean property_2() {
        Set<BinomialHeapNode> visited = new HashSet<>();
        Stack<BinomialHeapNode> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.isEmpty()) {
            BinomialHeapNode current = stack.pop();
            BinomialHeapNode parent = current.parent;
    
            if (parent != null && visited.contains(parent)) {
                return false;
            }
    
            if (!visited.add(current)) {
                return false;
            }
    
            if (parent != null) {
                stack.push(parent);
            }
        }
    
        return true;
    }


}
