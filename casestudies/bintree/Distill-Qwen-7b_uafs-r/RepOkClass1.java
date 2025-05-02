public class RepOkClass1{
    public boolean repOK_1() {
        int nodeCount = 0;
        int expectedSize = getSize();
        
        // Traverse the tree to count nodes and check structure
        Node current = root;
        while (current != null) {
            // Check that a node does not have both left and right children non-null
            if (current.left != null && current.right != null) {
                return false;
            }
            
            nodeCount++;
            current = current.left;
        }
        
        // Verify that the size matches the number of nodes
        return nodeCount == expectedSize;
    }


}
