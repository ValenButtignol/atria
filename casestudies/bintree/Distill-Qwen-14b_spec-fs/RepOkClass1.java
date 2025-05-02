public class RepOkClass1{
    public boolean repOK_1() {
        // Check BST property
        if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
    
        // Check size consistency
        int actualSize = countNodes(root);
        if (actualSize != size) {
            return false;
        }
    
        // Check uniqueness
        Set<Integer> seen = new HashSet<>();
        if (!hasUniqueValues(root, seen)) {
            return false;
        }
    
        // Check acyclic
        Set<Node> visited = new HashSet<>();
        if (!isAcyclic(root, visited)) {
            return false;
        }
    
        return true;
    }


}
