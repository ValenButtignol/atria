public class RepOkClass3{
    public boolean property_3() {
        int nodeCount = 0;
        AvlNode current = root;
    
        while (current != null) {
            nodeCount++;
            current = current.left;
        }
    
        return nodeCount == size;
    }


}
