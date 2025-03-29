public class RepOkClass1{
        public boolean repOK() {
            if (root == null) {
                if (size != 0) {
                    throw new RuntimeException("Size is not zero when root is null");
                }
                return true;
            }
    
            // Check size matches the actual number of nodes
            int actualSize = countNodes(root);
            if (size != actualSize) {
                throw new RuntimeException("Size does not match actual node count");
            }
    
            // Check root color
            if (root.color != Node.Color.BLACK) {
                throw new RuntimeException("Root is not black");
            }
    
            // Check all nodes have valid colors and red nodes have black children
            checkNode(root);
    
            // Collect black node counts for all paths to leaves
            blackCounts = new int[0];
            traverseAndCountBlackNodes(root, 0);
    
            // Check all paths have the same number of black nodes
            if (blackCounts.length == 0) {
                throw new RuntimeException("No leaves found");
            }
            int expected = blackCounts[0];
            for (int count : blackCounts) {
                if (count != expected) {
                    throw new RuntimeException("Paths have different numbers of black nodes");
                }
            }
    
            return true;
        }


}
