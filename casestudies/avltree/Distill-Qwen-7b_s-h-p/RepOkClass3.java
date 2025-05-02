public class RepOkClass3{
    public boolean property_3(AvlTree tree) {
        if (tree.isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        AvlNode minNode = findMin(tree.root);
        int actualMin = minNode.element;
        int foundMin = findMin(tree.root).element;
        return actualMin == foundMin;
    }


}
