public class RepOkClass4{
        private boolean property_4(Node node) {
            if (node == null) {
                return true;
            }
            if (node.color == RED) {
                if (node.left != null && node.right != null && node.left.color == RED && node.right.color == RED) {
                    return false;
                }
            }
            return property_4(node.left) && property_4(node.right);
        }

        public boolean invariant() {
            return property_4(root);
        }


}
