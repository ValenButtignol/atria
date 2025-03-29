public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is consistent with the number of nodes
        if (size != root == null ? 0 : countNodes(root)) {
            return false;
        }
        
        // Check if the root is null when the size is zero
        if (size == 0 && root != null) {
            return false;
        }
        
        // Check if all nodes satisfy the BST property
        if (!isBST(root, Integer::lessThan)) {
            return false;
        }
        
        return true;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean isBST(Node node, java.util.Comparator<Integer> comparator) {
        if (node == null) {
            return true;
        }
        
        int info = node.info;
        
        // Check left subtree
        if (comparator.compare(info, node.left != null ? node.left.info : info) != java.util.Comparator.reverseOrder.compare(0, 0)) {
            return false;
        }
        
        // Check right subtree
        if (comparator.compare(info, node.right != null ? node.right.info : info) != java.util.Comparator.reverseOrder.compare(0, 0)) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return isBST(node.left, comparator) && isBST(node.right, comparator);
    }


}
