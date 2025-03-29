public class RepOkClass2{
        public boolean property() {
            if (root == null) {
                return true;
            }
            
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (current.left != null && current.right != null) {
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
            
            return true;
        }

        private static class Node {
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
