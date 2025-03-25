public class RepOkClass1{
    public boolean repOK() {
        if (size == 0 && Nodes == null) {
            return true;
        }
    
        int maxDegree = 0;
        int numTrees = 0;
        int totalSize = 0;
    
        // Check each degree appears at most once
        for (int degree = 0; degree <= maxDegree; degree++) {
            if (numTrees >= 1) {
                return false;
            }
            numTrees++;
        }
    
        // Check maximum degree is within allowed range
        if (maxDegree > Math.log(size + 1) / Math.log(2)) {
            return false;
        }
    
        // Check total size matches
        int sum = 0;
        while (Nodes != null) {
            sum += Nodes.size();
            Nodes = Nodes.sibling;
        }
        if (sum != size) {
            return false;
        }
    
        // Check each tree is valid
        while (Nodes != null) {
            BinomialHeapNode tree = Nodes;
            int current = tree;
            int expectedSize = (int) (Math.pow(2, tree.getDegree())) - 1;
            if (current.size() != expectedSize) {
                return false;
            }
            while (current != null) {
                if (current.key > current.child.key) {
                    return false;
                }
                current = current.sibling;
            }
            Nodes = Nodes.sibling;
        }
    
        // Check root is not null when size > 0
        if (size > 0 && Nodes == null) {
            return false;
        }
    
        return true;
    }


}
