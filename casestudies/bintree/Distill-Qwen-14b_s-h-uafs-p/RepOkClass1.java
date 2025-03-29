public class RepOkClass1{
    public boolean property() {
        int count = 0;
        
        class Counter {
            void traverse(Node node) {
                if (node != null) {
                    count++;
                    traverse(node.left);
                    traverse(node.right);
                }
            }
        }
        
        if (root == null) {
            return size == 0;
        }
        
        Counter counter = new Counter();
        counter.traverse(root);
        
        return count == size;
    }


}
