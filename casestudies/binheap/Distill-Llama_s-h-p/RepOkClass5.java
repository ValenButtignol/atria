public class RepOkClass5{
    public boolean property() {
        // Check if the size is correctly initialized
        if (size != 0 && Nodes == null) {
            return false;
        }
    
        // Test insertion
        BinomialHeapNode node = new BinomialHeapNode(1);
        insert(1);
        if (size != 1) {
            return false;
        }
    
        // Test deletion
        delete(1);
        if (size != 0) {
            return false;
        }
    
        // Test another insertion
        insert(2);
        if (size != 1) {
            return false;
        }
    
        // Test another deletion
        delete(2);
        if (size != 0) {
            return false;
        }
    
        return true;
    }


}
