public class RepOkClass2{
    public boolean property_2() {
        if (size == 0) {
            return true;
        }
        
        Node current = root;
        while (current != null) {
            int leftHeight = 0;
            int rightHeight = 0;
            
            Node leftChild = current.left;
            while (leftChild != null) {
                leftHeight++;
                leftChild = leftChild.left;
            }
            
            Node rightChild = current.right;
            while (rightChild != null) {
                rightHeight++;
                rightChild = rightChild.right;
            }
            
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return false;
            }
            
            current = current.right;
        }
        
        return true;
    }


}
