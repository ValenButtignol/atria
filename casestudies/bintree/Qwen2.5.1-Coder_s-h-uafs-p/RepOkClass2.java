public class RepOkClass2{
    public boolean property() {
        return checkBinaryProperty(root);
    }

    private boolean checkBinaryProperty(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return checkBinaryProperty(node.left) && checkBinaryProperty(node.right);
        }
        return (node.left == null && node.right == null) ||
               (node.left != null && node.right == null) ||
               (node.left == null && node.right != null);
    }


}
