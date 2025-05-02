public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return size == 0;
        }
        if (root.color != Color.BLACK) {
            return false;
        }
    
        // Check that every red node has a black parent
        if (!checkRedNodes()) {
            return false;
        }
    
        // Check key ordering
        List<K> keys = new ArrayList<>();
        inOrderTraversal(root, keys);
        if (!isSorted(keys)) {
            return false;
        }
    
        // Check for null keys
        if (!checkNullKeys()) {
            return false;
        }
    
        // Validate size consistency
        if (size != getNodeCount(root)) {
            return false;
        }
    
        // Ensure no cycles
        if (!checkCycles()) {
            return false;
        }
    
        return true;
    }

    private boolean checkRedNodes() {
        return traverseAndCheck(new CheckRedNodesVisitor());
    }

    private boolean checkNullKeys() {
        return traverseAndCheck(new CheckNullKeysVisitor());
    }

    private boolean checkCycles() {
        Set<Node> visited = new HashSet<>();
        return traverseAndCheck(new CycleDetector(visited));
    }

    private boolean isSorted(List<K> keys) {
        for (int i = 1; i < keys.size(); i++) {
            if (keys.get(i) < keys.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private int getNodeCount(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getNodeCount(node.left) + getNodeCount(node.right);
    }

        private final Set<Node> visited;
    
        CycleDetector(Set<Node> visited) {
            this.visited = visited;
        }
    
        @Override
        boolean visit(Node node) {
            if (visited.contains(node)) {
                return false;
            }
            visited.add(node);
            return true;
        }
    }

    private void inOrderTraversal(Node node, List<K> keys) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, keys);
        keys.add(node.key);
        inOrderTraversal(node.right, keys);
    }


}
