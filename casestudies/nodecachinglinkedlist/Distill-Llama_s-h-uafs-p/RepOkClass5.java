public class RepOkClass5{
    public boolean property_5() {
        Set<LinkedListNode> visited = new HashSet<>();
        visited.add(header);
        LinkedListNode current = header.next;
        while (current != header) { // Prevents infinite loop in case of a cycle
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            current = current.next;
        }
        return true;
    }


}
