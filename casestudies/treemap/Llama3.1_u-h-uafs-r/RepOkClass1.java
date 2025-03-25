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
            if (current.left != null && current.left.parent != current) {
                return false;
            }
            if (current.right != null && current.right.parent != current) {
                return false;
            }
            current = current.left;
        }
    
        current = root;
        while (current != null) {
            if (current.color == RED && current.parent == null) {
                return false;
            }
            if (current.color == RED && current.parent != null && current.parent.color == RED) {
                return false;
            }
            current = current.left;
        }
    
        return true;
    }


}
