public class RepOkClass5 {
    public boolean property() {
        return checkRedRedViolation(root);
    }
    
    private boolean checkRedRedViolation(Node node) {
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
        return checkRedRedViolation(node.left) && checkRedRedViolation(node.right);
    }
}
