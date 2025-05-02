public class RepOkClass1{
    public boolean repOK_1() {
        if (size == 0) {
            return root == null;
        }
    
        Node current = root;
        while (current != null) {
            int balance = current.height;
            int leftHeight = (current.left != null) ? current.left.height : -1;
            int rightHeight = (current.right != null) ? current.right.height : -1;
            int leftBalance = leftHeight - rightHeight;
    
            if (leftBalance > 1 || leftBalance < -1) {
                return false;
            }
    
            current = current.left;
        }
    
        return true;
    }


}
