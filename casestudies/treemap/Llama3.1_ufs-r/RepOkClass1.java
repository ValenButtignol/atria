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
    
        Node current = root;
        while (current != null) {
            if (current.color == RED) {
                if (current.left != null && current.left.color == RED) {
                    return false;
                }
                if (current.right != null && current.right.color == RED) {
                    return false;
                }
            }
            if (current.left != null && current.left.color == RED) {
                return false;
            }
            if (current.right != null && current.right.color == RED) {
                return false;
            }
            current = current.left;
        }
    
        return true;
    }


}
