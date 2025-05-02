public class RepOkClass2{
    private boolean property_2() {
        if (root == null) {
            return true;
        }
        return checkNode(root);
    }

    private boolean checkNode(Node node) {
        if (node.left != null && node.left.parent != node) {
            return false;
        }
        if (node.right != null && node.right.parent != node) {
            return false;
        }
        if (node.left != null && !checkNode(node.left)) {
            return false;
        }
        if (node.right != null && !checkNode(node.right)) {
            return false;
        }
        return true;
    }


}
