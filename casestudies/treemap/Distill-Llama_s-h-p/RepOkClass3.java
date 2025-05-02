public class RepOkClass3{
        public boolean property_3() {
            int actualSize = 0;
            if (root != null) {
                Stack<Node> stack = new Stack<>();
                stack.push(root);
                while (!stack.isEmpty()) {
                    Node node = stack.pop();
                    actualSize++;
                    if (node.left != null) stack.push(node.left);
                    if (node.right != null) stack.push(node.right);
                }
            }
            return actualSize == this.size;
        }


}
