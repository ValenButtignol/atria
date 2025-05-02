public class RepOkClass1{
    public boolean repOK_1() {
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
            if (!Nodes.repOK_1()) {
                return false;
            }
        }
    
        return true;
    }


}
