public class RepOkClass1{
    public boolean repOK() {
        if (root == null) {
            return true;
        }
    
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
    
        if (Math.abs(leftHeight - rightHeight) > ALLOWED_IMBALANCE) {
            return false;
        }
    
        return repOK(root.left) && repOK(root.right);
    }

    private int getHeight(AvlNode node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }


}
