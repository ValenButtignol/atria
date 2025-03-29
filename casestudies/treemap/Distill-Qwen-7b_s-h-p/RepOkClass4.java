public class RepOkClass4{
        private boolean property(Node node) {
            if (node == null) {
                return true;
            }
            if (node.color == RED) {
                if (node.left != null && node.right != null && node.left.color == RED && node.right.color == RED) {
                    return false;
                }
            }
            return property(node.left) && property(node.right);
        }

        public boolean invariant() {
            return property(root);
        }


}
