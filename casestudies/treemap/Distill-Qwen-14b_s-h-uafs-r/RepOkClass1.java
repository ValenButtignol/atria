public class RepOkClass1{
    public boolean repOK_1() {
        if (root != null && root.color != BLACK) {
            return false;
        }
    
        if (size < 0) {
            return false;
        }
    
        if (root == null && size != 0) {
            return false;
        }
    
        int blackNodes = 0;
        Node current = root;
        while (current != null) {
            if (current.color == BLACK) {
                blackNodes++;
            }
            current = current.right;
        }
    
        int expectedBlackNodes = 0;
        Node node = root;
        while (node != null) {
            if (node.color == BLACK) {
                expectedBlackNodes++;
            }
            node = node.left;
        }
    
        if (blackNodes != expectedBlackNodes) {
            return false;
        }
    
        int sizeCount = 0;
        current = root;
        while (current != null) {
            sizeCount++;
            current = current.right;
        }
    
        if (sizeCount != size) {
            return false;
        }
    
        return true;
    }


}
