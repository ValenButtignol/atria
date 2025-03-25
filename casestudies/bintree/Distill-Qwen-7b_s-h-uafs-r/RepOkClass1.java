public class RepOkClass1{
    public boolean repOK() {
        // Check if root is null and size is zero
        if (root == null && size != 0) {
            return false;
        }
        // Check if root is not null and size matches the number of nodes
        if (root != null && size != getNodeCount()) {
            return false;
        }
        // Check if each node satisfies the BST property
        if (!isBST()) {
            return false;
        }
        // Check if there are no duplicates
        if (!hasUniqueValues()) {
            return false;
        }
        return true;
    }

    private int getNodeCount() {
        int count = 0;
        Node current = root;
        while (current != null) {
            count++;
            current = current.right;
        }
        return count;
    }

    private boolean isBST() {
        return isBSTHelper(root, null, null);
    }

    private boolean isBSTHelper(Node node, Node left, Node right) {
        if (node == null) {
            return true;
        }
        if (left != null && node.info <= left.info) {
            return false;
        }
        if (right != null && node.info >= right.info) {
            return false;
        }
        return isBSTHelper(node.left, left, node) && isBSTHelper(node.right, node, right);
    }

    private boolean hasUniqueValues() {
        Set<Integer> values = new HashSet<>();
        return isUniqueHelper(root, values);
    }

    private boolean isUniqueHelper(Node node, Set<Integer> values) {
        if (node == null) {
            return true;
        }
        if (values.contains(node.info)) {
            return false;
        }
        values.add(node.info);
        return isUniqueHelper(node.left, values) && isUniqueHelper(node.right, values);
    }


}
