public class RepOkClass3{
    public boolean property_3() {
        return checkLeftChild(root, true);
    }

    private boolean checkLeftChild(Node current, boolean mustHaveLeft) {
        if (current == null) {
            return true;
        }
        
        if (!mustHaveLeft && current.left == null) {
            return true;
        }
        
        if (current.left != null) {
            return checkLeftChild(current.left, true);
        }
        
        return checkLeftChild(current.right, false);
    }


}
