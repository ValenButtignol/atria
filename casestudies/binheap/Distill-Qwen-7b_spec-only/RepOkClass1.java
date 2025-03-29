public class RepOkClass1{
        public boolean repOK() {
            // Check that size is non-negative
            if (size < 0) {
                return false;
            }
    
            // Check that size does not exceed the number of nodes
            if (size > 0 && Nodes == null) {
                return false;
            }
    
            // Check that Nodes is null if and only if size is zero
            if (size == 0 && Nodes != null) {
                return false;
            }
    
            return true;
        }


}
