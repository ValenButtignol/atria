public class RepOkClass5{
    public boolean property() {
        int nodeCount = 0;
        Node current = root;
    
        while (current != null) {
            nodeCount++;
            current = current.right; // Traverse right first, then left
        }
    
        return nodeCount == size;
    }


}
