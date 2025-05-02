public class RepOkClass1{
    public boolean repOK_1() {
        // Check if the table is not null and is an array of Entries
        if (table == null || table.length == 0) {
            return (size == 0);
        }
    
        // Check each entry in the table
        for (int i = 0; i < table.length; i++) {
            Entry e = table[i];
            if (e == null) {
                continue;
            }
            // Check if the next pointer forms a valid linked list
            if (e.next != null && e.next.next != e) {
                return false;
            }
        }
    
        // Check size consistency
        if (size < 0 || size > table.length) {
            return false;
        }
    
        // Check modCount consistency
        if (modCount != size) {
            return false;
        }
    
        return true;
    }


}
