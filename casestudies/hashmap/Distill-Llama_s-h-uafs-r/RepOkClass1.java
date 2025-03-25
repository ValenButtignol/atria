public class RepOkClass1{
    public boolean repOK() {
        if (size() == 0) {
            return true;
        }
    
        if (modCount != 0) {
            return false;
        }
    
        if (noDuplicates()) {
            return false;
        }
    
        if (isOverloaded()) {
            return false;
        }
    
        if (isConsistent()) {
            return false;
        }
    
        return true;
    }

    private boolean noDuplicates() {
        Set<Object> seenKeys = new HashSet<>();
        for (Entry e : table) {
            if (e != null && seenKeys.contains(e.getKey())) {
                return false;
            }
            seenKeys.add(e.getKey());
        }
        return true;
    }

    private boolean isOverloaded() {
        return size() > threshold;
    }

    private boolean isConsistent() {
        for (Entry e : table) {
            if (e == null) {
                continue;
            }
            int bucketIndex = indexFor(e.hash, table.length);
            if (bucketIndex != e.bucketIndex) {
                return false;
            }
        }
        return true;
    }


}
