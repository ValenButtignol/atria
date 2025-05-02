public class RepOkClass3{
    public boolean property_3() {
        if (Nodes == null) {
            return true;
        }
        Stack<BinomialHeapNode> stack = new Stack<>();
        stack.push(Nodes);
        while (!stack.isEmpty()) {
            BinomialHeapNode current = stack.pop();
            int childCount = 0;
            BinomialHeapNode child = current.child;
            while (child != null) {
                childCount++;
                child = child.sibling;
            }
            if (childCount != current.degree) {
                return false;
            }
            child = current.child;
            while (child != null) {
                stack.push(child);
                child = child.sibling;
            }
        }
        return true;
    }


}
