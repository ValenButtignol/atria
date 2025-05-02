public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the root is null, then the size should be 0
        if (root == null) {
            return size == 0;
        }
        
        // Check if the size is correct
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
