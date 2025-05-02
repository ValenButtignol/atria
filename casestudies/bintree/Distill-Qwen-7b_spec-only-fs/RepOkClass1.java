public class RepOkClass1{
    public boolean repOK_1() {
        // Check BST property
        if (!checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check size consistency
        if (getSize() != countNodes()) {
            return false;
        }
    
        // Check unique values
        if (!checkUniqueValues(root, new HashSet<>())) {
            return false;
        }
    
        // Check acyclic structure (implicitly satisfied by BST properties)
        return true;
    }

    private boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
    
        if (node.info <= min) {
            return false;
        }
    
        if (node.info >= max) {
            return false;
        }
    
        return checkBST(node.left, min, node.info) && checkBST(node.right, node.info, max);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
    
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private boolean checkUniqueValues(Node node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
    
        if (seen.contains(node.info)) {
            return false;
        }
    
        seen.add(node.info);
    
        return checkUniqueValues(node.left, seen) && checkUniqueValues(node.right, seen);
    }


}
