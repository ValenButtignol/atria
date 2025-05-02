public class RepOkClass1{
    public boolean repOK_1() {
        if (size == 0) {
            return modCount == 0;
        }
        
        if (threshold != (int) (Math.ceil((float) loadFactor * (float) capacity))) {
            return false;
        }
        
        if (loadFactor != (float) size / (float) capacity) {
            return false;
        }
        
        if (modCount < 1) {
            return false;
        }
        
        return true;
    }


}
