public class RepOkClass5{
    public boolean property() {
        return isCyclic(root) == null;
    }

    private Node isCyclic(Node node) {
        if (node == null) {
            return null;
        }
        Node leftCycle = isCyclic(node.left);
        Node rightCycle = isCyclic(node.right);
        if (leftCycle != null) {
            return leftCycle;
        }
        if (rightCycle != null) {
            return rightCycle;
        }
        if (node.left == node || node.right == node) {
            return node;
        }
        return null;
    }


}
