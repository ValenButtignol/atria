public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (numNodes(root) != size) {
            return false;
        }
    
        if (!isCompleteBinaryTree(root)) {
            return false;
        }
    
        if (!isOrdered(root)) {
            return false;
        }
    
        if (!hasNoDuplicates(root)) {
            return false;
        }
    
        if (!isAcyclic(root)) {
            return false;
        }
    
        return true;
    }

    private int numNodes(BinomialHeapNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + numNodes(root.left) + numNodes(root.right);
    }

    private boolean isCompleteBinaryTree(BinomialHeapNode root) {
        if (root == null) {
            return true;
        }
    
        int expectedHeight = (int) (Math.log(size) / Math.log(2));
        int actualHeight = height(root);
    
        if (actualHeight > expectedHeight) {
            return false;
        }
    
        return isCompleteBinaryTree(root.left) && isCompleteBinaryTree(root.right);
    }

    private int height(BinomialHeapNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private boolean isOrdered(BinomialHeapNode root) {
        if (root == null) {
            return true;
        }
    
        BinomialHeapNode left = root.left;
        BinomialHeapNode right = root.right;
    
        if (left != null && (root.info <= left.info)) {
            return false;
        }
    
        if (right != null && (root.info >= right.info)) {
            return false;
        }
    
        return isOrdered(left) && isOrdered(right);
    }

    private boolean hasNoDuplicates(BinomialHeapNode root) {
        Set<Integer> seen = new HashSet<>();
        return hasNoDuplicatesHelper(root, seen);
    }

    private boolean hasNoDuplicatesHelper(BinomialHeapNode node, Set<Integer> seen) {
        if (node == null) {
            return true;
        }
    
        if (!seen.add(node.key)) {
            return false;
        }
    
        return hasNoDuplicatesHelper(node.left, seen) && hasNoDuplicatesHelper(node.right, seen);
    }

    private boolean isAcyclic(BinomialHeapNode root) {
        if (root == null) {
            return true;
        }
    
        Set<BinomialHeapNode> visited = new HashSet<>();
        visited.add(root);
    
        Queue<BinomialHeapNode> queue = new LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            BinomialHeapNode current = queue.remove();
    
            if (current.parent != null && visited.contains(current.parent)) {
                return false;
            }
    
            if (current.left != null && !visited.add(current.left)) {
                return false;
            }
    
            if (current.right != null && !visited.add(current.right)) {
                return false;
            }
    
            queue.add(current.left);
            queue.add(current.right);
        }
    
        return true;
    }


}
