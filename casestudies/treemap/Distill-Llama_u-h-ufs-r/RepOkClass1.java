public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return (root == null);
        }
    
        if (root == null) {
            return false;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        int nodeCount = countNodes(root);
        return nodeCount == size;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean checkBSTAndColors(Node node, Set<Node> visited) {
        if (node == null) {
            return true;
        }
    
        if (visited.contains(node)) {
            return false;
        }
    
        visited.add(node);
    
        // Check color constraints
        if (node.color == RED) {
            if (node.parent == null || node.parent.color != BLACK) {
                return false;
            }
        }
    
        // Check BST property
        if (node.left != null) {
            if (compare(node.left.key, node.key) >= 0) {
                return false;
            }
        }
    
        if (node.right != null) {
            if (compare(node.key, node.right.key) <= 0) {
                return false;
            }
        }
    
        return checkBSTAndColors(node.left, visited) && checkBSTAndColors(node.right, visited);
    }


}
