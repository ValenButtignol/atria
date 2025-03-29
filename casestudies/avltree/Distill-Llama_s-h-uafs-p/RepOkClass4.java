public class RepOkClass4{
    public boolean property() {
        Set<AvlNode> visited = new HashSet<>();
        return dfs(root, visited);
    }

    private boolean dfs(AvlNode node, Set<AvlNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        return dfs(node.left, visited) && dfs(node.right, visited);
    }


}
