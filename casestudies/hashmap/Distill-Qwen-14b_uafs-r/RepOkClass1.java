public class RepOkClass1{
    public boolean repOK_1() {
        // Check size consistency
        int actualSize = 0;
        for (Entry[] tab : new Entry[]{table}) { // To avoid issues with table being modified during iteration
            for (int i = 0; i < tab.length; i++) {
                Entry e = tab[i];
                while (e != null) {
                    actualSize++;
                    e = e.next;
                }
            }
        }
        if (actualSize != size) {
            return false;
        }
    
        // Check each Entry's hash maps to correct bucket
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                int hash = e.hash;
                int index = indexFor(hash, table.length);
                if (index != i) {
                    return false;
                }
                e = e.next;
            }
        }
    
        // Check no duplicate keys in each bucket
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            Set<Object> keysInBucket = new HashSet<>();
            while (e != null) {
                Object key = e.key == NULL_KEY ? null : e.key;
                if (keysInBucket.contains(key)) {
                    return false;
                }
                keysInBucket.add(key);
                e = e.next;
            }
        }
    
        // Check for cycles in linked lists
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            Set<Entry> visited = new HashSet<>();
            while (e != null) {
                if (visited.contains(e)) {
                    return false;
                }
                visited.add(e);
                e = e.next;
            }
        }
    
        // Check that each Entry's hash is correctly computed
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            while (e != null) {
                Object key = e.key == NULL_KEY ? null : e.key;
                Object value = e

}
