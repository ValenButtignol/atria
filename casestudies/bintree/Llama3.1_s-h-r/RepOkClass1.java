public class RepOkClass1{
        public boolean repOK() {
            return repOKHelper(root);
        }

        private boolean repOKHelper(Node node) {
            if (node == null) {
                return true;
            }
            if (node.left != null && node.info <= node.left.info) {
                return false;
            }
            if (node.right != null && node.info >= node.right.info) {
                return false;
            }
            return repOKHelper(node.left) && repOKHelper(node.right);
        }

        public static class Node {
            private Node left; 
            private Node right;
            private int info;
    
            public Node(int info) {
                this.info = info;
            }
        }
    }
    ```

}
