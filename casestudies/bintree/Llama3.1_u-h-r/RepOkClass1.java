public class RepOkClass1{
        public boolean repOK_1() {
            return root == null || repOKRecursive(root);
        }

        private boolean repOKRecursive(Node current) {
            if (current == null) {
                return true;
            }
            if (current.left != null && current.info <= current.left.info) {
                return false;
            }
            if (current.right != null && current.info >= current.right.info) {
                return false;
            }
            return repOKRecursive(current.left) && repOKRecursive(current.right);
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
