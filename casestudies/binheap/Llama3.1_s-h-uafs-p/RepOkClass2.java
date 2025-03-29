public class RepOkClass2{
    public boolean property() {
        Set<BinomialHeapNode> visited = new HashSet<BinomialHeapNode>();
        return propertyRecursive(Nodes, visited);
    }

    private boolean propertyRecursive(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return propertyRecursive(node.sibling, visited) && propertyRecursive(node.child, visited);
    }


}
