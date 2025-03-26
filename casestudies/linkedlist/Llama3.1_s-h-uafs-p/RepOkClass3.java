public class RepOkClass3{
    public boolean property() {
        Set<Entry> visited = new HashSet<Entry>();
        Entry current = header.next;
        while (current != header) {
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            current = current.next;
        }
        return true;
    }


}
