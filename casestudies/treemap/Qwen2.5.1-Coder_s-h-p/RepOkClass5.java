public class RepOkClass5{
    public boolean property() {
        return checkDescendantsProperty(root);
    }

    private boolean checkDescendantsProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.color == RED) {
            if (node.left != null && node.left.color == RED) {
                return false;
            }
            if (node.right != null && node.right.color == RED) {
                return false;
            }
        }
        int blackCountLeft = countBlackNodes(node.left);
        int blackCountRight = countBlackNodes(node.right);
        return blackCountLeft == blackCountRight && checkDescendantsProperty(node.left) && checkDescendantsProperty(node.right);
    }

    private int countBlackNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int leftBlackCount = countBlackNodes(node.left);
        int rightBlackCount = countBlackNodes(node.right);
        return (node.color == BLACK ? 1 : 0) + Math.max(leftBlackCount, rightBlackCount);
    }


}
