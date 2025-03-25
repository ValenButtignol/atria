public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        return isBinaryTree(root);
    }

    private boolean isBinaryTree(Node node) {
        if (node == null) {
            return true;
        }
    
        if (node.left != null && node.right != null) {
            return isBinaryTree(node.left) && isBinaryTree(node.right);
        } else if (node.left != null || node.right != null) {
            return false;
        }
    
        return true;
    }


}
