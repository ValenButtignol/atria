public class RepOkClass1{
    public boolean repOK() {
        if (size > 0 && root == null) {
            return false;
        }
    
        int nodeCount = 0;
        Node current = root;
    
        while (current != null) {
            nodeCount++;
            current = current.left;
        }
    
        if (nodeCount != size) {
            return false;
        }
    
        Node current = root;
        while (current != null) {
            if (current.left != null && current.right != null) {
                return false;
            }
            current = current.right;
        }
    
        return true;
    }


}
