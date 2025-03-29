public class RepOkClass4{
        public boolean property() {
            return isBST(root);
        }

        private boolean isBST(Node node) {
            if (node == null) {
                return true;
            }
            
            boolean leftCheck = isBST(node.left);
            if (!leftCheck) {
                return false;
            }
            
            boolean rightCheck = isBST(node.right);
            if (!rightCheck) {
                return false;
            }
            
            if (node.left != null && node.left.info >= node.info) {
                return false;
            }
            
            if (node.right != null && node.right.info <= node.info) {
                return false;
            }
            
            return true;
        }


}
