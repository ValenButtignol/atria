public class RepOkClass4{
    public boolean property_4() {
        if (header.next == header && header.previous == header) {
            return true;
        }
    
        LinkedListNode firstNode = header.next;
        LinkedListNode lastNode = header.previous;
    
        if (firstNode == null || lastNode == null) {
            return false;
        }
    
        LinkedListNode currentNode = firstNode;
        while (currentNode.next != header) {
            currentNode = currentNode.next;
        }
        if (currentNode != lastNode) {
            return false;
        }
    
        currentNode = lastNode;
        while (currentNode.previous != header) {
            currentNode = currentNode.previous;
        }
        if (currentNode != firstNode) {
            return false;
        }
    
        return true;
    }


}
