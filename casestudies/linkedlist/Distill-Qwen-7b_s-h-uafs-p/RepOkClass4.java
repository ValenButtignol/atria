public class RepOkClass4{
    public boolean property() {
        Set<Node> visited = new HashSet<>();
        visited.add(header);
        LinkedList<Node> workList = new LinkedList<>();
        workList.add(header.next);
        
        while (!workList.isEmpty()) {
            Node current = (Node) workList.removeFirst();
            if (current == header) {
                continue;
            }
            
            // Check next pointer
            if (current.next != null && current.next.previous != current) {
                return false;
            }
            
            // Check previous pointer
            if (current.previous != null && current.previous.next != current) {
                return false;
            }
            
            if (current == tail) {
                // Check if next is null
                if (current.next != null) {
                    return false;
                }
            }
            
            workList.add(current.next);
        }
        
        return true;
    }


}
