public class RepOkClass3{
    public boolean property() {
        Set<Node> visited = new HashSet<>();
        Node current = header;
        while (current != null) {
            if (visited.contains(current)) {
                return false;
            }
            visited.add(current);
            current = current.next;
        }
        return true;
    }


}
