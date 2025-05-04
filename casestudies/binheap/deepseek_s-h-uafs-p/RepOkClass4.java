public class RepOkClass4 {
    public boolean property_4() {
        if (Nodes == null) {
            return size == 0;
        }
        Set<BinomialHeapNode> visited = new HashSet<>();
        Queue<BinomialHeapNode> queue = new LinkedList<>();
        queue.add(Nodes);
        int nodeCount = 0;
    
        while (!queue.isEmpty()) {
            BinomialHeapNode current = queue.poll();
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            nodeCount++;
    
            if (current.child != null) {
                BinomialHeapNode child = current.child;
                if (child.parent != current) {
                    return false;
                }
                queue.add(child);
                BinomialHeapNode sibling = child.sibling;
                while (sibling != null) {
                    if (sibling.parent != current) {
                        return false;
                    }
                    queue.add(sibling);
                    sibling = sibling.sibling;
                }
            }
        }
        return nodeCount == size;
    }
}
