public class RepOkClass5{
    public boolean property() {
        if (root == null) {
            return true;
        }
        
        return allLeavesAreBlack(root);
    }

    private boolean allLeavesAreBlack(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.left == null && node.right == null) {
            return node.color == BLACK;
        }
        
        boolean leftAllBlack = allLeavesAreBlack(node.left);
        boolean rightAllBlack = allLeavesAreBlack(node.right);
        
        return leftAllBlack && rightAllBlack;
    }


}
