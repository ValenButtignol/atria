public class RepOkClass2{
    public boolean property_2() {
        return checkHeight(root);
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


}
