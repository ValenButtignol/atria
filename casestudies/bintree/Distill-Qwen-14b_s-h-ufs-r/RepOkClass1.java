public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
        if (size == 0) {
            return root == null;
        }
        if (root == null) {
            return false;
        }
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        int nodeCount = 0;
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current == null) {
                continue;
            }
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            nodeCount++;
            if (current.left != null) {
                if (current.left.info >= current.info) {
                    return false;
                }
                stack.push(current.left);
            }
            if (current.right != null) {
                if (current.right.info <= current.info) {
                    return false;
                }
                stack.push(current.right);
            }
        }
        return nodeCount == size;
    }


}
