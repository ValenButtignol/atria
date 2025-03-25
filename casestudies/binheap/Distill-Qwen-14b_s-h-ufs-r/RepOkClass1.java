public class RepOkClass1{
    public boolean repOK() {
        // Check if the heap is empty
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check heap property: every node's key is <= its children's keys
        if (!checkHeapProperty(Nodes)) {
            return false;
        }
    
        // Check degree property: each node's degree equals the number of its children
        if (!checkDegreeProperty(Nodes)) {
            return false;
        }
    
        // Check that the roots of trees of the same degree form a linked list
        if (!checkRootLinking()) {
            return false;
        }
    
        // Check size consistency
        if (size != calculateTotalNodes()) {
            return false;
        }
    
        return true;
    }

    private boolean checkHeapProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        // Check left and right children
        if (node.child != null) {
            if (node.key > node.child.key) {
                return false;
            }
            // Recursively check children
            if (!checkHeapProperty(node.child)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDegreeProperty(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        int childCount = 0;
        BinomialHeapNode currentChild = node.child;
        while (currentChild != null) {
            childCount++;
            currentChild = currentChild.sibling;
        }
        return node.degree == childCount;
    }

    private boolean checkRootLinking() {
        // Collect all roots by their degree
        Map<Integer, BinomialHeapNode> rootsByDegree = new HashMap<>();
        collectRootsByDegree(Nodes, rootsByDegree);
    
        // For each degree, check that the roots form a linked list
        for (Map.Entry<Integer, List<BinomialHeapNode>> entry : rootsByDegree.entrySet()) {
            int degree = entry.getKey();
            List<BinomialHeapNode> roots = entry.getValue();
            if (roots.size() < 1) {
                continue;
            }
            // Check that the roots form a linked list without cycles
            Set<BinomialHeapNode> visited = new HashSet<>();
            BinomialHeapNode current = roots.get(0);
            while (current != null && !visited.contains(current)) {
                visited.add(current);
                current = current.sibling;
            }
            if (current != null) {
                // Cycle detected
                return false;
            }
        }
        return true;
    }

    private void collectRootsByDegree(BinomialHeapNode node, Map<Integer, List<BinomialHeapNode>> rootsByDegree) {
        if (node == null) {
            return;
        }
        if (node.parent == null) { // It's a root
            List<BinomialHeapNode> list = rootsByDegree.get(node.degree);
            if (list == null) {
                list = new ArrayList<>();
                rootsByDegree.put(node.degree, list);
            }
            list.add(node);
        }
        // Recursively check children
        collectRootsByDegree(node.child, rootsByDegree);
    }

    private int calculateTotalNodes() {
        return Nodes == null ? 0 : Nodes.size();
    }


}
