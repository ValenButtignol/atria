public class RepOkClass2{
    public boolean property() {
        if (isEmpty()) {
            return true;
        }
        
        int treeHeight = findHeight(root);
        int nodeCount = size;
        
        int logValue = (int) (Math.log(nodeCount) / Math.log(2));
        return treeHeight <= 5 * logValue;
    }


}
