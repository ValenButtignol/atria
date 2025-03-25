public class RepOkClass1{
    private boolean repOK() {
        // Check if the root is null
        if (root == null) {
            return size == 0;
        }
    
        // Check if the root is black
        if (root.color == RED) {
            return false;
        }
    
        // Check if all nodes are properly linked
        checkLinks(root);
    
        // Check if all nodes have a valid color
        checkColors(root);
    
        // Check if the size is correct
        return size == countNodes(root);
    
    }

    private void checkLinks(Node node) {
        if (node == null) return;
        checkLinks(node.left);
        checkLinks(node.right);
        if (node.left != null && node.left.parent != node) {
            throw new AssertionError("Invalid link");
        }
        if (node.right != null && node.right.parent != node) {
            throw new AssertionError("Invalid link");
        }
        if (node.parent != null && (node.parent.left != node || node.parent.right != node)) {
            throw new AssertionError("Invalid link");
        }
    }

    private void checkColors(Node node) {
        if (node == null) return;
        checkColors(node.left);
        checkColors(node.right);
        if (node.color == RED && (node.left != null && node.left.color == RED || node.right != null && node.right.color == RED)) {
            throw new AssertionError("Invalid color");
        }
    }

    private int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }


}
