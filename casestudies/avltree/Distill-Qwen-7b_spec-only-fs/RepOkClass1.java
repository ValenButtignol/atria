public class RepOkClass1{
    public boolean repOK_1() {
        if (size == 0) {
            return root == null;
        }
        
        Node current = root;
        while (current != null) {
            int leftHeight = current.left != null ? current.left.height : 0;
            int rightHeight = current.right != null ? current.right.height : 0;
            
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return false;
            }
            
            current = current.next;
        }
        
        return true;
    }


}
