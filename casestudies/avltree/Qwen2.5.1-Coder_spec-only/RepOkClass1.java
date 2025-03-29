public class RepOkClass1{
        public boolean repOK() {
            return checkBalance(root);
        }

        private boolean checkBalance(Node node) {
            if (node == null) {
                return true;
            }
    
            int leftHeight = (node.left != null) ? node.left.height : 0;
            int rightHeight = (node.right != null) ? node.right.height : 0;
    
            // Check the balance factor
            if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
                return false;
            }
    
            // Recursively check the left and right subtrees
            return checkBalance(node.left) && checkBalance(node.right);
        }


}
