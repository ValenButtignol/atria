public class RepOkClass1{
    public boolean repOK_1() {
        if (size != countNodes()) {
            return false;
        }
        if (!isMinHeap()) {
            return false;
        }
        if (!isAcyclic()) {
            return false;
        }
        if (!isBinomialHeap()) {
            return false;
        }
        return true;
    }

    private int countNodes() {
        return countNodesRecursive(nodes());
    }

    private int countNodesRecursive(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }

    private boolean isMinHeap() {
        return isMinHeapRecursive(nodes(), root());
    }

    private boolean isMinHeapRecursive(BinomialHeapNode node, BinomialHeapNode parent) {
        if (node == null) {
            return true;
        }
        if (node != parent && node.key > parent.key) {
            return false;
        }
        return isMinHeapRecursive(node.left, node) && isMinHeapRecursive(node.right, node);
    }

    private boolean isAcyclic() {
        return isAcyclicRecursive(nodes(), root());
    }

    private boolean isAcyclicRecursive(BinomialHeapNode node, Set<BinomialHeapNode> visited) {
        if (node == null) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        if (node.left != null && !isAcyclicRecursive(node.left, visited)) {
            return false;
        }
        if (node.right != null && !isAcyclicRecursive(node.right, visited)) {
            return false;
        }
        return true;
    }

    private boolean isBinomialHeap() {
        return isBinomialHeapRecursive(nodes(), 0);
    }

    private boolean isBinomialHeapRecursive(BinomialHeapNode node, int expectedDegree) {
        if (node == null) {
            return expectedDegree == 0;
        }
        int actualDegree = 0;
        if (node.left != null) {
            actualDegree = 1 + isBinomialHeapRecursive(node.left, 0);
        }
        if (node.right != null) {
            actualDegree = 1 + isBinomialHeapRecursive(node.right, actualDegree);
        }
        return actualDegree == expectedDegree;
    }


}
