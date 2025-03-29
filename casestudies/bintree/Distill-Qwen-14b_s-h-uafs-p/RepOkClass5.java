public class RepOkClass5{
    public boolean property() {
        if (root == null) {
            return true;
        }
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                if (visited.contains(current.left)) {
                    return false;
                }
                visited.add(current.left);
                queue.add(current.left);
            }
            if (current.right != null) {
                if (visited.contains(current.right)) {
                    return false;
                }
                visited.add(current.right);
                queue.add(current.right);
            }
        }
        return true;
    }


}
