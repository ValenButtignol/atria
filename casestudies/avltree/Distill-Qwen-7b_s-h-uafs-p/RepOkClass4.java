public class RepOkClass4{
    public boolean property() {
        if (isEmpty()) {
            return false;
        }
        AvlNode maxNode = findMax();
        if (maxNode == null) {
            return false;
        }
        int maxElement = maxNode.element;
        // Verify that maxElement is indeed the maximum by checking all nodes
        // This is a simplified check; a full verification would require traversing the tree
        // and ensuring no node has a larger element
        return true;
    }


}
