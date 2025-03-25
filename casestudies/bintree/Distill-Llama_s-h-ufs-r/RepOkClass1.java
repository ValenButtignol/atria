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
    
        int nodeCount = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            nodeCount++;
    
            // Check if current node has both left and right children
            if (current.left != null && current.right != null) {
                return false;
            }
    
            // Push children to stack
            if (current.left != null) {
                stack.push(current.left);
            }
    
            if (current.right != null) {
                stack.push(current.right);
            }
        }
    
        return nodeCount == size;
    }


}
