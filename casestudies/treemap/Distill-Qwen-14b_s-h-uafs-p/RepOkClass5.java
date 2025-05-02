public class RepOkClass5{
    public boolean property_5() {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            // Check root's parent is null
            if (current == root && current.parent != null) {
                return false;
            }
            // Check non-root nodes have a valid parent
            if (current != root && current.parent == null) {
                return false;
            }
            // Check parent's left or right points back to current
            if (current != root) {
                Node parent = current.parent;
                if (parent.left != current && parent.right != current) {
                    return false;
                }
            }
            // Check children's parent references
            if (current.left != null) {
                if (current.left.parent != current) {
                    return false;
                }
                queue.add(current.left);
            }
            if (current.right != null) {
                if (current.right.parent != current) {
                    return false;
                }
                queue.add(current.right);
            }
        }
        return true;
    }


}
