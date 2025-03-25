public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        }
    
        if (root.color != BLACK) {
            return false;
        }
    
        return checkRedBlackProperties(root, null, -1);
    }

    private boolean checkRedBlackProperties(Node node, Node parent, int depth) {
        if (node == null) {
            return true;
        }
    
        if (node.color == RED) {
            if (parent == null || parent.color != BLACK) {
                return false;
            }
        }
    
        if (depth != -1 && Math.abs(depth - getHeight(node.left)) > 1) {
            return false;
        }
    
        return checkRedBlackProperties(node.left, node, depth + 1) &&
               checkRedBlackProperties(node.right, node, depth + 1);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }


}
