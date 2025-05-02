public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is correct
        if (size != numNodes(root)) {
            return false;
        }
    
        // Check for duplicates
        Set<Integer> seenKeys = new HashSet<>();
        if (!noDuplicates(root, seenKeys)) {
            return false;
        }
    
        // Check ordering: each node's key must be less than its parent's key
        if (!isOrdered(root)) {
            return false;
        }
    
        // Check structure: parent, sibling, and child relationships
        if (!isStructureValid(root)) {
            return false;
        }
    
        // Check degrees: each node's degree must be correct
        if (!allDegreesCorrect(root)) {
            return false;
        }
    
        return true;
    }

    private boolean numNodes(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numNodes(node.left) + numNodes(node.right);
    }

    private boolean noDuplicates(BinomialHeapNode root, Set<Integer> seenKeys) {
        if (root == null) {
            return true;
        }
        if (seenKeys.contains(root.info)) {
            return false;
        }
        seenKeys.add(root.info);
        return noDuplicates(root.left, seenKeys) && noDuplicates(root.right, seenKeys);
    }

    private boolean isOrdered(BinomialHeapNode node) {
        return isOrderedHelper(node, -1, -1);
    }

    private boolean isOrderedHelper(BinomialHeapNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if ((min != -1 && node.info <= min) || (max != -1 && node.info >= max)) {
            return false;
        }
        boolean leftOK = true;
        if (node.left != null) {
            leftOK = isOrderedHelper(node.left, min, node.info);
        }
        boolean rightOK = true;
        if (node.right != null) {
            rightOK = isOrderedHelper(node.right, node.info, max);
        }
        return leftOK && rightOK;
    }

    private boolean isStructureValid(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        // Check parent
        if (node.parent != null && node.parent != node) {
            return false;
        }
        // Check siblings
        if (node.sibling != null) {
            BinomialHeapNode sibling = node.sibling;
            if (sibling.parent != node) {
                return false;
            }
        }
        // Check children
        if (node.child != null) {
            BinomialHeapNode child = node.child;
            if (child.parent != node) {
                return false;
            }
        }
        return isStructureValid(node.left) && isStructureValid(node.right);
    }

    private boolean allDegreesCorrect(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
        int expectedDegree = (node.child != null) ? 1 + numChildren(node.child) : 1;
        if (node.degree != expectedDegree) {
            return false;
        }
        return allDegreesCorrect(node.left) && allDegreesCorrect(node.right);
    }

    private int numChildren(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numChildren(node.left) + numChildren(node.right);
    }


}
