public class RepOkClass1{
        public boolean repOK() {
            // Check if the size is correct
            if (size < 0) {
                return false;
            }
    
            // Check if the heap is empty
            if (root == null) {
                return size == 0;
            }
    
            // Check if the heap is a valid binary tree
            if (!isValidBinaryTree(root)) {
                return false;
            }
    
            // Check if each node satisfies the binomial heap property
            if (!isBinomialHeapPropertySatisfied(root)) {
                return false;
            }
    
            // Check if the root of each tree has a degree that is a power of 2
            if (!areDegreesPowersOfTwo(root)) {
                return false;
            }
    
            return true;
        }

        private boolean isValidBinaryTree(Node node) {
            if (node == null) {
                return true;
            }
    
            if (node.child != null && node.child.parent != node) {
                return false;
            }
    
            if (node.sibling != null && node.sibling.parent != node) {
                return false;
            }
    
            return isValidBinaryTree(node.child) && isValidBinaryTree(node.sibling);
        }

        private boolean isBinomialHeapPropertySatisfied(Node node) {
            if (node == null) {
                return true;
            }
    
            if (node.child != null && node.key > node.child.key) {
                return false;
            }
    
            return isBinomialHeapPropertySatisfied(node.child) && isBinomialHeapPropertySatisfied(node.sibling);
        }

        private boolean areDegreesPowersOfTwo(Node node) {
            if (node == null) {
                return true;
            }
    
            if (!isPowerOfTwo(node.degree)) {
                return false;
            }
    
            return areDegreesPowersOfTwo(node.sibling);
        }

        private boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }


}
