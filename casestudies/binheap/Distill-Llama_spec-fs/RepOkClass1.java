public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the size is correct
        if (size != numNodes(rootNode)) {
            return false;
        }
    
        // Check for duplicates
        if (!hasDuplicates(rootNode)) {
            return false;
        }
    
        // Check the heap structure
        if (!isHeapStructureValid(rootNode)) {
            return false;
        }
    
        // Check if the heap is a complete binary tree
        if (!isCompleteBinaryTree(rootNode)) {
            return false;
        }
    
        return true;
    }

    private int numNodes(BinomialHeapNode rootNode) {
        if (rootNode == null) {
            return 0;
        }
        return 1 + numNodes(rootNode.leftChild) + numNodes(rootNode.rightChild);
    }

    private boolean hasDuplicates(BinomialHeapNode rootNode) {
        Set<Integer> seenKeys = new HashSet<>();
        return !hasDuplicatesHelper(rootNode, seenKeys);
    }

    private boolean hasDuplicatesHelper(BinomialHeapNode node, Set<Integer> seenKeys) {
        if (node == null) {
            return true;
        }
        if (seenKeys.contains(node.getKey())) {
            return false;
        }
        seenKeys.add(node.getKey());
        return hasDuplicatesHelper(node.leftChild, seenKeys) && hasDuplicatesHelper(node.rightChild, seenKeys);
    }

    private boolean isHeapStructureValid(BinomialHeapNode rootNode) {
        if (rootNode == null) {
            return true;
        }
    
        // Check left and right children
        if (!isLeftChildValid(rootNode.leftChild, rootNode.getKey())) {
            return false;
        }
        if (!isRightChildValid(rootNode.rightChild, rootNode.getKey())) {
            return false;
        }
    
        // Recurse on children
        return isHeapStructureValid(rootNode.leftChild) && isHeapStructureValid(rootNode.rightChild);
    }

    private boolean isLeftChildValid(BinomialHeapNode node, int parentKey) {
        if (node == null) {
            return true;
        }
        if (node.getKey() >= parentKey) {
            return false;
        }
        return true;
    }

    private boolean isRightChildValid(BinomialHeapNode node, int parentKey) {
        if (node == null) {
            return true;
        }
        if (node.getKey() <= parentKey) {
            return false;
        }
        return true;
    }

    private boolean isCompleteBinaryTree(BinomialHeapNode rootNode) {
        if (rootNode == null) {
            return true;
        }
    
        // Check if left and right subtrees are complete
        return isCompleteBinaryTreeHelper(rootNode.leftChild, rootNode.rightChild);
    }

    private boolean isCompleteBinaryTreeHelper(BinomialHeapNode left, BinomialHeapNode right) {
        if (left == null && right == null) {
            return true;
        }
    
        if (left == null) {
            return isComplete(right);
        }
    
        if (right == null) {
            return isComplete(left);
        }
    
        // Check if both subtrees are complete
        return isComplete(left.leftChild) && isComplete(left.rightChild) &&
               isComplete(right.leftChild) && isComplete(right.rightChild);
    }

    private boolean isComplete(BinomialHeapNode node) {
        if (node == null) {
            return true;
        }
    
        // Check if the node has both children
        return node.leftChild != null && node.rightChild != null &&
               isComplete(node.leftChild) && isComplete(node.rightChild);
    }


}
