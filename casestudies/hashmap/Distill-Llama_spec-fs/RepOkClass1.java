public class RepOkClass1{
    public boolean repOK() {
        // Check if the size is correct
        if (size != countEntries()) {
            return false;
        }
    
        // Check for duplicates
        for (int i = 0; i < table.length; i++) {
            Entry current = table[i];
            if (current != null) {
                if (containsKey(current.getKey())) {
                    return false;
                }
            }
        }
    
        // Check if the table is correctly filled
        for (int i = 0; i < table.length; i++) {
            Entry current = table[i];
            if (current != null) {
                // Check if the hash code corresponds to the bucket
                if (indexFor(current.hash, table.length) != i) {
                    return false;
                }
                // Check if the linked list is correctly formed
                Entry prev = null;
                Entry next = current.next;
                while (next != null) {
                    prev = next;
                    next = next.next;
                }
                if (prev != null) {
                    if (prev.next != current) {
                        return false;
                    }
                }
            }
        }
    
        // Check if the modCount is correct
        if (modCount != countModifications()) {
            return false;
        }
    
        return true;
    }

    private int countEntries() {
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                count++;
            }
        }
        return count;
    }

    private int countModifications() {
        int count = 0;
        for (Entry e : table) {
            if (e != null) {
                count++;
            }
        }
        return count;
    }

    private boolean containsKey(Object key) {
        Object maskedKey = maskNull(key);
        int hash = hash(maskedKey);
        int index = indexFor(hash, table.length);
        Entry e = table[index];
        while (e != null) {
            if (e.hash == hash && eq(maskedKey, e.key)) {
                return true;
            }
            e = e.next;
        }
        return false;
    }


}
