public class RepOkClass1{
    public boolean property() {
        int nodeCount = 0;
        Node current = root;
    
        while (current != null) {
            nodeCount++;
            current = current.left;
            current = current.right;
        }
    
        return nodeCount == size;
    }


}
