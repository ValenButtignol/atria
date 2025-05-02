public class RepOkClass5{
    public boolean property_5() {
        // Check if root is null
        if (root == null) {
            // If root is null, size must be zero
            return size == 0;
        } else {
            // If root is not null, size must not be zero
            return size != 0;
        }
    }

    private int countNodes() {
        int nodeCount = 0;
        AvlNode current = root;
        while (current != null) {
            nodeCount++;
            current = current.left;
            // Also check the right child for completeness
            if (current != null) {
                current = current.right;
            }
        }
        return nodeCount;
    }

    public boolean property_5() {
        // Check root condition
        if (root == null) {
            return size == 0;
        } else {
            return size != 0;
        }
    }

    public boolean sizeConsistency() {
        int nodeCount = countNodes();
        return nodeCount == size;
    }

    public boolean property_5() {
        return sizeConsistency() && property_5();
    }


}
