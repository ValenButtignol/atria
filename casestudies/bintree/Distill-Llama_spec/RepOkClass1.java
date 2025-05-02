public class RepOkClass1{
        public boolean repOK_1() {
            // Check if the tree is a BST
            if (!isBST(root, null, null)) {
                return false;
            }
    
            // Count the number of nodes
            int count = countNodes(root);
    
            // Check if the size matches the count
            return count == size;
        }

        private static boolean isBST(Node node, Integer min, Integer max) {
            if (node == null) {
                return true;
            }
            if (min != null && node.info <= min) {
                return false;
            }
            if (max != null && node.info >= max) {
                return false;
            }
            return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
        }

        private static int countNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
        }


}
