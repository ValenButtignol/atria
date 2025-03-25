public class RepOkClass1{
    public boolean repOK() {
        if (table == null) {
            return false;
        }
        int tableLength = table.length;
        if ((tableLength & (tableLength - 1)) != 0) {
            return false;
        }
        if (threshold != (int)(tableLength * loadFactor)) {
            return false;
        }
        if (size < 0 || size > MAXIMUM_CAPACITY || size > threshold) {
            return false;
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            return false;
        }
        if (modCount < 0) {
            return false;
        }
        return true;
    }


}
