public class RepOkClass1{
    public boolean repOK() {
        if (size < 0) {
            return false;
        }
    
        if (Nodes == null && size != 0) {
            return false;
        }
    
        if (Nodes != null && size == 0) {
            return false;
        }
    
        if (Nodes != null) {
            if (!Nodes.repOK()) {
                return false;
            }
        }
    
        return true;
    }


}
