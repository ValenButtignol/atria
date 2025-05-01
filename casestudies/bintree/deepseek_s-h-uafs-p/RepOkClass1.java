public class RepOkClass1 {
    public boolean property() {
        java.util.Set<Node> visited = new java.util.HashSet<>();
        return isAcyclic(root, visited);
    }
    
    private boolean isAcyclic(Node node, java.util.Set<Node> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return isAcyclic(node.left, new java.util.HashSet<>(visited)) && 
               isAcyclic(node.right, new java.util.HashSet<>(visited));
    }
}
