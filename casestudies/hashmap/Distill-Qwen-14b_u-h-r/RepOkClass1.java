public class RepOkClass1{
    public boolean repOK() {
        if (table == null) return false;
        if (size < 0) return false;
        if (threshold < 0) return false;
        if (threshold > table.length && threshold != Integer.MAX_VALUE) return false;
        if (threshold == Integer.MAX_VALUE && table.length != MAXIMUM_CAPACITY) return false;
        if (loadFactor <= 0) return false;
        if (modCount < 0) return false;
        if (size > threshold) return false;
        if ((table.length & (table.length - 1)) != 0) return false;
        return true;
    }


}
