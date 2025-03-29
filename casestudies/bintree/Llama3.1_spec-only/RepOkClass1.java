public class RepOkClass1{
        public boolean repOK() {
            // The tree is empty if and only if the root is null
            boolean isEmpty = root == null;
    
            // The size of the tree is the number of nodes in the tree
            // This is equivalent to the number of nodes in the tree rooted at the root node
            boolean correctSize = size == countNodes(root);
    
            // The tree is valid if and only if it is empty or the root node's info is not null
            boolean validRoot = (isEmpty && root == null) || (root.info != null);
    
            // The left and right children of a node are valid if and only if they are either null or valid nodes
            boolean validChildren = isValidNode(root.left) && isValidNode(root.right);
    
            // The size of the tree is equal to the number of nodes in the tree
            boolean correctSize2 = size == countNodes(root);
    
            return isEmpty || (validRoot && validChildren && correctSize2);
        }

        private boolean isValidNode(Node node) {
            if (node == null) {
                return true;
            }
            return node.info != null && isValidNode(node.left) && isValidNode(node.right);
        }

        private int countNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
        }

        public void add(int value) {
            if (root == null) {
                root = new Node(value);
                size++;
            } else {
                addRecursive(root, value);
            }
        }

        private void addRecursive(Node node, int value) {
            if (value == node.info) {
                return;
            }
            if (value < node.info) {
                if (node.left == null) {
                    node.left = new Node(value);
                    size++;
                } else {
                    addRecursive(node.left, value);
                }
            } else {
                if (node.right == null) {
                    node.right = new Node(value);
                    size++;
                } else {
                    addRecursive(node.right, value);
                }
            }
        }

        public int getSize() {
            return size;
        }


}
