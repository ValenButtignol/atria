public class RepOkClass1{
    public boolean repOK() {
        // Check if the tree is empty
        if (root == null) {
            return size == 0;
        }
    
        // Check if the size is consistent with the actual number of nodes
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
    
        // Check if the tree satisfies the BST property
        if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check for cycles in the tree structure
        Set<Node> visited = new HashSet<>();
        if (hasCycle(root, visited)) {
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

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.info <= min || node.info >= max) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    private boolean hasCycle(Node node, Set<Node> visited) {
        if (node == null) {
            return false;
        }
        if (visited.contains(node)) {
            return true;
        }
        visited.add(node);
        return hasCycle(node.left, visited) || hasCycle(node.right, visited);
    }


}
