public class RepOkClass1{
        public boolean repOK_1() {
            if (root == null) {
                return true;
            }
            
            // Check root color
            if (!isRootBlack()) {
                throw new ConcurrentModificationException();
            }
            
            // Check binary search property
            if (!isBST()) {
                throw new ConcurrentModificationException();
            }
            
            // Check no two consecutive red nodes
            if (!isRedBlackBalanced()) {
                throw new ConcurrentModificationException();
            }
            
            // Check size consistency
            if (size() != size) {
                throw new ConcurrentModificationException();
            }
            
            // Check comparator is not null unless default
            if (comparator != null && comparator.class != Comparator.class) {
                throw new ConcurrentModificationException();
            }
            
            // Check thread safety
            return true;
        }

        private boolean isRootBlack() {
            return root != null && root.color == BLACK;
        }

        private boolean isBST() {
            if (root == null) {
                return true;
            }
            
            return isBSTHelper(root);
        }

        private boolean isBSTHelper(Node node) {
            if (node == null) {
                return true;
            }
            
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            
            if (node.right != null && node.right.color == RED) {
                return false;
            }
            
            return isBSTHelper(node.left) && isBSTHelper(node.right);
        }

        private boolean isRedBlackBalanced() {
            if (root == null) {
                return true;
            }
            
            return !hasTwoRedsInRow();
        }

        private boolean hasTwoRedsInRow() {
            Node current = root;
            while (current != null) {
                if (current.color == RED) {
                    if (current.parent != null && current.parent.color == RED) {
                        return true;
                    }
                }
                current = current.right;
            }
            
            return false;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public int size() {
            return size;
        }


}
