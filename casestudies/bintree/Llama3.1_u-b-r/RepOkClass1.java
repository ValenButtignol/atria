public class RepOkClass1{
    public boolean repOK() {
        // Check if the root is null, in which case the tree is empty
        if (root == null) {
            return size == 0;
        }
    
        // Check if the size of the tree is correct
        return size == countNodes(root);
    
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }


}
