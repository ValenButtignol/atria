public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        return checkHeight(root) && checkBalance(root);
    }

    private boolean checkHeight(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
    
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return checkHeight(node.left) && checkHeight(node.right);
    }

    private boolean checkBalance(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        if (!checkHeight(node)) {
            return false;
        }
    
        return checkBalance(node.left) && checkBalance(node.right);
    }

    private int height(AvlNode node) {
        return node == null ? -1 : node.height;
    }


}
