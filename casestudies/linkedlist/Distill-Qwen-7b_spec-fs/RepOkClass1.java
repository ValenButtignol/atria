public class RepOkClass1{
    public boolean repOK() {
        if (header == null) {
            return true;
        }
    
        if (size != numNodes(root)) {
            return false;
        }
    
        if (!isAcyclic()) {
            return false;
        }
    
        if (!isOrdered(root)) {
            return false;
        }
    
        if (!noDuplicates(root)) {
            return false;
        }
    
        return true;
    }

    private boolean isAcyclic() {
        Set<Entry> visited = new HashSet<>();
        visited.add(root);
        LinkedList<Entry> workList = new LinkedList<>();
        workList.add(root);
        while (!workList.isEmpty()) {
            Entry current = (Entry) workList.removeFirst();
            if (current.left != null) {
                if (!visited.add(current.left)) {
                    return false;
                }
                workList.add(current.left);
            }
            if (current.right != null) {
                if (!visited.add(current.right)) {
                    return false;
                }
                workList.add(current.right);
            }
        }
        return true;
    }

    private int numNodes(Entry n) {
        if (n == null) {
            return 0;
        }
        return 1 + numNodes(n.left) + numNodes(n.right);
    }

    private boolean isOrdered(Entry n) {
        return isOrdered(n, -1, -1);
    }

    private boolean isOrdered(Entry n, int min, int max) {
        if ((min != -1 && n.element <= min) || (max != -1 && n.element >= max)) {
            return false;
        }
        if (n.left != null) {
            if (!isOrdered(n.left, min, n.element)) {
                return false;
            }
        }
        if (n.right != null) {
            if (!isOrdered(n.right, n.element, max)) {
                return false;
            }
        }
        return true;
    }

    private boolean noDuplicates(Entry root) {
        Set<Integer> seen = new HashSet<>();
        return noDuplicatesHelper(root, seen);
    }

    private boolean noDuplicatesHelper(Entry node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
        if (!seen.add(node.element)) {
            return false;
        }
        return noDuplicatesHelper(node.left, seen) && noDuplicatesHelper(node.right, seen);
    }


}
