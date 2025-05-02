public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true; // An empty heap is valid
        }
    
        int count = 0;
        java.util.Queue<BinomialHeapNode> queue = new java.util.LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            BinomialHeapNode current = queue.remove();
            count++;
    
            // Check if children have the current node as their parent
            if (current.left != null) {
                if (current.left.parent != current) {
                    return false;
                }
            }
            if (current.right != null) {
                if (current.right.parent != current) {
                    return false;
                }
            }
    
            // Check heap property: current's key < parent's key (if not root)
            if (current != root) {
                BinomialHeapNode parent = current.parent;
                if (current.key >= parent.key) {
                    return false;
                }
            }
    
            // Enqueue children for further checking
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    
        // Ensure the size matches the actual number of nodes
        if (size != count) {
            return false;
        }
    
        return true;
    }


}
