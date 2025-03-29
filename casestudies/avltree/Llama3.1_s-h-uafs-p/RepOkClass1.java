public class RepOkClass1{
    public boolean property() {
        return checkBalance(root);
    }

    private boolean checkBalance(AvlNode t) {
        if (t == null)
            return true;
    
        int leftHeight = height(t.left);
        int rightHeight = height(t.right);
    
        if (Math.abs(leftHeight - rightHeight) > AvlTree.ALLOWED_IMBALANCE)
            return false;
    
        return checkBalance(t.left) && checkBalance(t.right);
    }


}
