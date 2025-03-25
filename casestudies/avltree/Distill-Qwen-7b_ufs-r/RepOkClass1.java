public class RepOkClass1{
    public boolean repOK() {
        if (isEmpty()) {
            return true;
        }
        
        Node current = getRoot();
        while (current != null) {
            int leftHeight = current.left != null ? current.left.height : -1;
            int rightHeight = current.right != null ? current.right.height : -1;
            int balanceFactor = leftHeight - rightHeight;
            
            if (balanceFactor < -1 || balanceFactor > 1) {
                return false;
            }
            
            current = current.right;
        }
        
        return true;
    }


}
