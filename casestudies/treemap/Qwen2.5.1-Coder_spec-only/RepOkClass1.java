public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is consistent with the number of key-value pairs in the tree
        if (size != sizeOfTree(root)) {
            return false;
        }
    
        // Check if the tree maintains the red-black tree properties
        if (!isRedBlackTree(root)) {
            return false;
        }
    
        // Check if all keys are unique
        if (!areKeysUnique(root, null)) {
            return false;
        }
    
        // Check if the comparator is used correctly if provided
        if (comparator != null) {
            if (!areKeysConsistentWithComparator(root, comparator)) {
                return false;
            }
        }
    
        return true;
    }

    private int sizeOfTree(TreeNode<K, V> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeOfTree(node.left) + sizeOfTree(node.right);
    }

    private boolean isRedBlackTree(TreeNode<K, V> node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED && node.parent != null && node.parent.color == RED) {
            return false;
        }
        if (!isRedBlackTree(node.left) || !isRedBlackTree(node.right)) {
            return false;
        }
        if (node.left != null && comparator.compare(node.left.key, node.key) > 0) {
            return false;
        }
        if (node.right != null && comparator.compare(node.right.key, node.key) < 0) {
            return false;
        }
        return true;
    }

    private boolean areKeysUnique(TreeNode<K, V> node, TreeNode<K, V> parent) {
        if (node == null) {
            return true;
        }
        if (parent != null && comparator.compare(node.key, parent.key) == 0) {
            return false;
        }
        if (!areKeysUnique(node.left, node) || !areKeysUnique(node.right, node)) {
            return false;
        }
        return true;
    }

    private boolean areKeysConsistentWithComparator(TreeNode<K, V> node, Comparator<? super K> comparator) {
        if (node == null) {
            return true;
        }
        if (node.left != null && comparator.compare(node.left.key, node.key) > 0) {
            return false;
        }
        if (node.right != null && comparator.compare(node.right.key, node.key) < 0) {
            return false;
        }
        if (!areKeysConsistentWithComparator(node.left, comparator) || !areKeysConsistentWithComparator(node.right, comparator)) {
            return false;
        }
        return true;
    }


}
