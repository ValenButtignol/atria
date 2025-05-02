public class RepOkClass1{
        public boolean repOK_1() {
            if (root == null) {
                return true;
            }
    
            return isBalanced(root);
        }

        private boolean isBalanced(AvlNode node) {
            if (node == null) {
                return true;
            }
    
            int leftHeight = (node.left != null) ? node.left.height : -1;
            int rightHeight = (node.right != null) ? node.right.height : -1;
    
            if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
                return false;
            }
    
            return isBalanced(node.left) && isBalanced(node.right);
        }


}
