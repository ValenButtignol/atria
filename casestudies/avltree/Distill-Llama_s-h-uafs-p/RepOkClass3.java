public class RepOkClass3{
    public boolean property() {
        int nodeCount = 0;
        AvlNode current = root;
    
        while (current != null) {
            nodeCount++;
            current = current.left;
        }
    
        return nodeCount == size;
    }


}
