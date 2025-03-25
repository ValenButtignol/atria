public class RepOkClass1{
    public boolean repOK() {
        if (Nodes == null) {
            return size == 0;
        }
    
        // Check if the number of trees matches the number of set bits in size
        int expectedTrees = Integer.bitCount(size);
        int actualTrees = 0;
        BinomialHeapNode current = Nodes;
        while (current != null) {
            if (current.getDegree() == 0) {
                actualTrees++;
            }
            current = current.getSibling();
        }
    
        if (actualTrees != expectedTrees) {
            return false;
        }
    
        // Check each tree has the correct degree
        for (BinomialHeapNode node : getNodes()) {
            if (node.getDegree() < 0 || node.getDegree() >= Integer.MAX_VALUE) {
                return false;
            }
        }
    
        // Check min-heap property for each tree
        for (BinomialHeapNode node : getNodes()) {
            if (node.isRoot()) {
                if (node.getKey() == null) {
                    return false;
                }
                if (node.getSibling() != null && node.getSibling().getKey() < node.getKey()) {
                    return false;
                }
                if (node.getChild() != null && node.getChild().isRoot()) {
                    if (node.getChild().getKey() < node.getKey()) {
                        return false;
                    }
                }
            }
        }
    
        // Check each node has valid parent, sibling, and child relationships
        for (BinomialHeapNode node : getNodes()) {
            if (node.getParent() == null && !node.isRoot()) {
                return false;
            }
            if (node.getSibling() == null && node != Nodes) {
                return false;
            }
            if (node.getChild() != null && node.getChild().getParent() != node) {
                return false;
            }
        }
    
        return true;
    }

    private List<BinomialHeapNode> getNodes() {
        List<BinomialHeapNode> nodes = new ArrayList<>();
        BinomialHeapNode current = Nodes;
        while (current != null) {
            nodes.add(current);
            current = current.getSibling();
        }
        return nodes;
    }


}
