public class RepOkClass1{
        public boolean repOK_1() {
            if (root == null) {
                return true;
            }
    
            // Check BST property
            if (!checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                return false;
            }
    
            // Check AVL balance
            if (!checkBalance(root)) {
                return false;
            }
    
            // Check height correctness
            if (!checkHeights(root)) {
                return false;
            }
    
            return true;
        }

        private boolean checkBST(AvlNode node, int min, int max) {
            if (node == null) {
                return true;
            }
    
            if (node.element < min || node.element > max) {
                return false;
            }
    
            return checkBST(node.left, min, node.element) && checkBST(node.right, node.element, max);
        }

        private boolean checkBalance(AvlNode node) {
            if (node == null) {
                return true;
            }
    
            int leftHeight = node.left != null ? node.left.height : 0;
            int rightHeight = node.right != null ? node.right.height : 0;
    
            if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
                return false;
            }
    
            return checkBalance(node.left) && checkBalance(node.right);
        }

        private boolean checkHeights(AvlNode node) {
            if (node == null) {
                return true;
            }
    
            int leftHeight = node.left != null ? node.left.height : 0;
            int rightHeight = node.right != null ? node.right.height : 0;
            int maxHeight = Math.max(leftHeight, rightHeight);
    
            if (node.height != maxHeight + 1) {
                return false;
            }
    
            return checkHeights(node.left) && checkHeights(node.right);
        }


}
