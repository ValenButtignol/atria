public class RepOkClass2{
    public boolean property() {
        return checkHeightConsistency(root);
    }

    private boolean checkHeightConsistency(AvlNode node) {
        if (node == null) {
            return true;
        }
    
        int leftHeight = (node.left != null) ? node.left.height : -1;
        int rightHeight = (node.right != null) ? node.right.height : -1;
        int maxHeight = Math.max(leftHeight, rightHeight);
        int expectedHeight = maxHeight + 1;
    
        if (node.height != expectedHeight) {
            return false;
        }
    
        return checkHeightConsistency(node.left) && checkHeightConsistency(node.right);
    }


}
