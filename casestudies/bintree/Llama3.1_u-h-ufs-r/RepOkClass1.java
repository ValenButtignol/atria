public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
        
        if (size == 0) {
            return root == null;
        }
    
        if (root == null) {
            return false;
        }
    
        return repOKRecursive(root);
    }

    private boolean repOKRecursive(Node current) {
        if (current == null) {
            return true;
        }
    
        if (current.left != null && current.info <= current.left.info) {
            return false;
        }
    
        if (current.right != null && current.info <= current.right.info) {
            return false;
        }
    
        return repOKRecursive(current.left) && repOKRecursive(current.right);
    }


}
