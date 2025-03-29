public class RepOkClass1{
    public boolean property() {
        if (root == null) {
            return true;
        }
        if (root.color != BLACK) {
            return false;
        }
        return checkNodes(root, false);
    }

    private boolean checkNodes(Node node, boolean parentIsRed) {
        if (node.color != RED && node.color != BLACK) {
            return false;
        }
        if (parentIsRed && node.color == RED) {
            return false;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color != BLACK) {
                return false;
            }
            if (node.right != null && node.right.color != BLACK) {
                return false;
            }
        }
        boolean leftOk = (node.left == null) || checkNodes(node.left, node.color == RED);
        boolean rightOk = (node.right == null) || checkNodes(node.right, node.color == RED);
        return leftOk && rightOk;
    }


}
