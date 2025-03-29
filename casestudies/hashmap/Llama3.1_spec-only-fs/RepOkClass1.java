public class RepOkClass1{
    public boolean repOK() {
        if (size != countEntries()) {
            return false;
        }
    
        if (!noDuplicateKeys()) {
            return false;
        }
    
        if (!hashCodeConsistency()) {
            return false;
        }
    
        if (loadFactor < 0 || loadFactor > 1) {
            return false;
        }
    
        if (modCount != countModifications()) {
            return false;
        }
    
        return true;
    }

    private int countEntries() {
        int count = 0;
        for (Entry entry : table) {
            if (entry != null) {
                count++;
            }
        }
        return count;
    }

    private boolean noDuplicateKeys() {
        Set<Object> keys = new HashSet<>();
        for (Entry entry : table) {
            if (entry != null) {
                if (!keys.add(entry.getKey())) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hashCodeConsistency() {
        for (Entry entry : table) {
            if (entry != null) {
                if (entry.getHash() != entry.getKey().hashCode()) {
                    return false;
                }
            }
        }
        return true;
    }

    private int countModifications() {
        int count = 0;
        for (Entry entry : table) {
            if (entry != null) {
                count++;
            }
        }
        return count;
    }


}
