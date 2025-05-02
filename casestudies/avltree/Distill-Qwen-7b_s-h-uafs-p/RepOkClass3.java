public class RepOkClass3{
    public boolean property_3() {
        if (isEmpty()) {
            return false;
        }
        
        AvlNode minNode = findMin(root);
        if (minNode == null) {
            return false;
        }
        
        // Traverse to the leftmost node to find the minimum
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        int expectedMin = current.element;
        
        if (minNode.element != expectedMin) {
            return false;
        }
        
        return true;
    }


}
