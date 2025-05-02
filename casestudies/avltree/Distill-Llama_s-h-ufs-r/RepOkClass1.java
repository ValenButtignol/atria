public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return true;
        }
    
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = node.left != null ? node.left.height : -1;
        int rightHeight = node.right != null ? node.right.height : -1;
    
        if (leftHeight - rightHeight > ALLOWED_IMBALANCE) {
            return false;
        }
        if (rightHeight - leftHeight > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return checkBalance(node.left) && checkBalance(node.right);
    }


}
