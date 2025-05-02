public class RepOkClass4{
        public boolean property_4() {
            if (root == null) {
                return true;
            }
            HashSet<Integer> seenKeys = new HashSet<>();
            Stack<BinomialHeapNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                BinomialHeapNode node = stack.pop();
                if (seenKeys.contains(node.getKey())) {
                    return false;
                }
                seenKeys.add(node.getKey());
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
            return true;
        }


}
