public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
        if (size == 0) {
            return root == null;
        }
        if (root == null) {
            return false;
        }
    
        Set<Integer> seenValues = new HashSet<>();
        return checkBST(root, seenValues, 0);
    }

    private boolean checkBST(Node node, Set<Integer> seenValues, int nodeCount) {
        if (node == null) {
            return nodeCount == size;
        }
    
        if (seenValues.contains(node.value)) {
            return false;
        }
    
        seenValues.add(node.value);
        nodeCount++;
    
        // Check left child
        if (node.left != null) {
            if (node.left.value >= node.value) {
                return false;
            }
            if (!checkBST(node.left, seenValues, nodeCount)) {
                return false;
            }
        }
    
        // Check right child
        if (node.right != null) {
            if (node.right.value <= node.value) {
                return false;
            }
            if (!checkBST(node.right, seenValues, nodeCount)) {
                return false;
            }
        }
    
        return nodeCount == size;
    }


}
