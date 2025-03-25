public class RepOkClass1{
    public boolean repOK() {
        if (loadFactor > 1.0f) {
            return false;
        }
        if (size >= threshold) {
            return false;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && !(table[i] instanceof Entry)) {
                return false;
            }
        }
        if (modCount < 0) {
            return false;
        }
        if (size > table.length) {
            return false;
        }
        if (!isPowerOfTwo(table.length)) {
            return false;
        }
        return true;
    }

    private boolean isPowerOfTwo(int n) {
        return (n != 0) && (n & (n - 1)) == 0;
    }


}
