public class RepOkClass1{
    public boolean repOK_1() {
        if (table == null) {
            return false;
        }
        int tableLength = table.length;
        if ((tableLength & (tableLength - 1)) != 0) {
            return false;
        }
        if (size < 0 || size > tableLength) {
            return false;
        }
        if (threshold < 0 || threshold > tableLength) {
            return false;
        }
        if (modCount < 0) {
            return false;
        }
        int entryCount = 0;
        Set<Object> seenKeys = new HashSet<>();
        for (Entry e : table) {
            Entry current = e;
            while (current != null) {
                entryCount++;
                Object key = current.getKey();
                if (seenKeys.contains(key)) {
                    return false;
                }
                seenKeys.add(key);
                if (current.hash != ((key == null) ? 0 : key.hashCode())) {
                    return false;
                }
                if (current.next == null) {
                    current = null;
                } else if (!(current.next instanceof Entry)) {
                    return false;
                } else {
                    current = current.next;
                }
            }
        }
        if (entryCount != size) {
            return false;
        }
        return true;
    }


}
