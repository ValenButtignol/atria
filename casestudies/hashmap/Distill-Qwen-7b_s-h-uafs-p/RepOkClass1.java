public class RepOkClass1{
    public boolean property_1() {
        for (int i = 0; i < table.length; i++) {
            Entry current = table[i];
            if (current != null) {
                while (current != null) {
                    if (current.next != null && current.next != table[i]) {
                        return false;
                    }
                    current = current.next;
                }
            }
        }
        return true;
    }


}
