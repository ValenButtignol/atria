public class RepOkClass4{
    public boolean property() {
        if (root != null) {
            // Check root's parent is null
            if (root.parent != null) {
                return false;
            }
            // Use a queue for BFS traversal
            java.util.Queue<Node> queue = new java.util.LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                // Check parent for non-root nodes
                if (node != root && node.parent == null) {
                    return false;
                }
                // Check left child's parent
                if (node.left != null && node.left.parent != node) {
                    return false;
                }
                // Check right child's parent
                if (node.right != null && node.right.parent != node) {
                    return false;
                }
                // Add children to queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return true;
    }


}
