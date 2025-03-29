public class RepOkClass4{
    public boolean property() {
        if (root == null) {
            return true;
        }
        Set<AvlNode> visited = new HashSet<>();
        Queue<AvlNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            AvlNode current = queue.poll();
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return true;
    }


}
