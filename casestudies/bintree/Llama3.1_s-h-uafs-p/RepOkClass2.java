public class RepOkClass2{
    public boolean property() {
        return size == countNodes(root);
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }


}
