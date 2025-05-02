public class RepOkClass1{
    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        }
    
        if (!numNodes(Nodes) == size) {
            return false;
        }
    
        if (!isAcyclic(Nodes)) {
            return false;
        }
    
        if (!isOrdered(Nodes)) {
            return false;
        }
    
        if (!noDuplicates(Nodes)) {
            return false;
        }
    
        return true;
    }

    private boolean isAcyclic(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.parent == null) {
            return isAcyclic(node.left) && isAcyclic(node.right);
        }
    
        return isAcyclic(node.parent) && isAcyclic(node.left) && isAcyclic(node.right);
    }

    private int numNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.left) + numNodes(node.right);
    }

    private boolean isOrdered(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.parent != null && node.key < node.parent.key) {
            return false;
        }
    
        return isOrdered(node.parent) && isOrdered(node.left) && isOrdered(node.right);
    }

    private boolean noDuplicates(Node root) {
        Set<Integer> seen = new HashSet<>();
        return noDuplicatesHelper(root, seen);
    }

    private boolean noDuplicatesHelper(Node node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
    
        if (seen.contains(node.info)) {
            return false;
        }
    
        seen.add(node.info);
        return noDuplicatesHelper(node.left, seen) && noDuplicatesHelper(node.right, seen);
    }


}
