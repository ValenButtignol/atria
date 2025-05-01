public class RepOkClass2 {
    public boolean property() {
        return checkHeight(root);
    }
    
    private boolean checkHeight(AvlNode node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        boolean balanced = Math.abs(leftHeight - rightHeight) <= ALLOWED_IMBALANCE;
        boolean heightCorrect = node.height == Math.max(leftHeight, rightHeight) + 1;
        return balanced && heightCorrect && checkHeight(node.left) && checkHeight(node.right);
    }
}
