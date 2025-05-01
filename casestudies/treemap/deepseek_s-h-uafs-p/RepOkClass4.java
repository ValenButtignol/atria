public class RepOkClass4 {
    public boolean property() {
        if (root == null) {
            return true;
        }
        int blackHeight = -1;
        java.util.Stack<Node> stack = new java.util.Stack<>();
        stack.push(root);
        java.util.Stack<Integer> heights = new java.util.Stack<>();
        heights.push(0);
    
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int currentHeight = heights.pop();
    
            if (node == null) {
                if (blackHeight == -1) {
                    blackHeight = currentHeight;
                } else if (currentHeight != blackHeight) {
                    return false;
                }
                continue;
            }
    
            int newHeight = currentHeight + (node.color == BLACK ? 1 : 0);
            stack.push(node.left);
            heights.push(newHeight);
            stack.push(node.right);
            heights.push(newHeight);
        }
        return true;
    }
}
