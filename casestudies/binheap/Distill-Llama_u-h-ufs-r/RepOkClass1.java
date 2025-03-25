public class RepOkClass1{
    public boolean repOK() {
        if (root == null)
            return size == 0;
    
        if (numNodes(root) != size)
            return false;
    
        if (!isAcyclic(root))
            return false;
    
        if (!isOrdered(root))
            return false;
    
        if (!noDuplicates(root))
            return false;
    
        return true;
    }

    private boolean isAcyclic() {
        Set<Node> visited = new HashSet<Node>();
        visited.add(root);
        LinkedList<Node> workList = new LinkedList<Node>();
        workList.add(root);
        while (!workList.isEmpty()) {
            Node current = (Node) workList.removeFirst();
            if (current.left != null) {
                if (!visited.add(current.left))
                    return false;
                workList.add(current.left);
            }
            if (current.right != null) {
                if (!visited.add(current.right))
                    return false;
                workList.add(current.right);
            }
        }
        return true;
    }

    private int numNodes(Node n) {
        if (n == null)
            return 0;
        return 1 + numNodes(n.left) + numNodes(n.right);
    }

    private boolean isOrdered(Node n) {
        return isOrdered(n, -1, -1);
    }

    private boolean isOrdered(Node n, int min, int max) {
        if (n.info == null)
            return false;
        if ((min != -1 && n.info <= (min)) || (max != -1 && n.info >= (max)))
            return false;
        if (n.left != null)
            if (!isOrdered(n.left, min, n.info))
                return false;
        if (n.right != null)
            if (!isOrdered(n.right, n.info, max))
                return false;
        return true;
    }

    private boolean noDuplicates(Node root) {
        Set<Integer> seen = new HashSet<>();
        return noDuplicatesHelper(root, seen);
    }

    private boolean noDuplicatesHelper(Node node, Set<Integer> seen) {
        if (node == null) return true;
    
        if (!seen.add(node.info)) return false;
    
        return noDuplicatesHelper(node.left, seen) && noDuplicatesHelper(node.right, seen);
    }


}
