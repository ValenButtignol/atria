public class RepOkClass1{
    public boolean repOK_1() {
        if (size != 0 && root == null) {
            return false;
        }
        if (size == 0) {
            return root == null;
        }
        if (root.color != BLACK) {
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            count++;
            if (current.parent != null && current.parent.color == RED) {
                if (current.color != BLACK) {
                    return false;
                }
            }
            if (current.color == RED) {
                if (current.left != null && current.left.color == RED) {
                    return false;
                }
                if (current.right != null && current.right.color == RED) {
                    return false;
                }
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return count == size;
    }


}
