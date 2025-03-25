public class RepOkClass1{
    public boolean repOK() {
        // Check table length is a power of two and within maximum capacity
        int tableLength = table.length;
        if ((tableLength & (tableLength - 1)) != 0) {
            return false;
        }
        if (tableLength > MAXIMUM_CAPACITY) {
            return false;
        }
    
        // Check size does not exceed threshold
        if (size > threshold) {
            return false;
        }
    
        // Check for duplicates
        Set<Object> seenKeys = new HashSet<>();
        int nullKeyCount = 0;
        for (Entry e : table) {
            if (e == null) continue;
            Object key = e.getKey();
            if (key == NULL_KEY) {
                nullKeyCount++;
                if (nullKeyCount > 1) {
                    return false;
                }
            } else {
                if (seenKeys.contains(key)) {
                    return false;
                }
                seenKeys.add(key);
            }
        }
    
        return true;
    }


}
