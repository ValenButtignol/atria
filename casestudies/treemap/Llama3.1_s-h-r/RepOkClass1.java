public class RepOkClass1{
    private boolean repOK_1() {
        if (root != null) {
            if (root.color != BLACK) {
                return false;
            }
            if (root.left != null && root.left.parent != root) {
                return false;
            }
            if (root.right != null && root.right.parent != root) {
                return false;
            }
            if (!repOK_1(root.left)) {
                return false;
            }
            if (!repOK_1(root.right)) {
                return false;
            }
        }
        return true;
    }

    private boolean repOK_1(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color != BLACK && node.color != RED) {
            return false;
        }
        if (node.left != null && node.left.parent != node) {
            return false;
        }
        if (node.right != null && node.right.parent != node) {
            return false;
        }
        if (node.left != null && node.right != null && node.left.parent == node.right) {
            return false;
        }
        return repOK_1(node.left) && repOK_1(node.right);
    }


}
