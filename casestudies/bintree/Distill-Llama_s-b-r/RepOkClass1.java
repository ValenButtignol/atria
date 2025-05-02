public class RepOkClass1{
    public boolean repOK_1() {
        return checkStructure(root) && countNodes() == size;
    }

    private static boolean checkStructure(Node node) {
        if (node == null) {
            return true;
        }
        // Check if the node is the root
        if (!isRoot(node)) {
            // The node should have a parent
            Node parent = findParent(node);
            if (parent == null) {
                return false;
            }
            // The node should be either left or right child of its parent
            if (parent.left == null && node != parent.right) {
                return false;
            }
            // The node's value should be less than its parent's value if it's the left child,
            // or greater if it's the right child
            if (node.info <= parent.info && node != parent.right) {
                return false;
            }
            if (node.info >= parent.info && node != parent.left) {
                return false;
            }
        }
        // Recursively check left and right subtrees
        return checkStructure(node.left) && checkStructure(node.right);
    }

    private static boolean isRoot(Node node) {
        return node == root;
    }

    private static Node findParent(Node node) {
        if (node == null) {
            return null;
        }
        // Traverse up to find the root
        Node parent = node;
        while (parent != null && !isRoot(parent)) {
            parent = parent.parent; // Note: Parent class would need a 'parent' field
        }
        return parent;
    }

    private static int countNodes() {
        return countNodesRecursive(root);
    }

    private static int countNodesRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }


}
