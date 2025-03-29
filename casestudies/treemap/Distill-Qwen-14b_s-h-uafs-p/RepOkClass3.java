public class RepOkClass3{
    public boolean property() {
        int count = 0;
        Node current = root;
        if (current == null) {
            return size == 0;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(current);
        while (!stack.isEmpty()) {
            current = stack.pop();
            count++;
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return count == size;
    }


}
