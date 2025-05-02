public class RepOkClass1{
    public boolean repOK_1() {
        if (size < 0) {
            return false;
        }
        if (size == 0) {
            return root == null;
        }
        int nodeCount = 0;
        Node current = root;
        while (current != null) {
            if (current.left != null && !(current.left instanceof Node)) {
                return false;
            }
            if (current.right != null && !(current.right instanceof Node)) {
                return false;
            }
            nodeCount++;
            current = current.left;
        }
        return nodeCount == size;
    }


}
