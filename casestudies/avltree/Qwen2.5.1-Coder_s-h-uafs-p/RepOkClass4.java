public class RepOkClass4{
    public boolean property_4() {
        List<Integer> inOrderList = new ArrayList<>();
        inOrderTraversal(root, inOrderList);
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i - 1) > inOrderList.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void inOrderTraversal(AvlNode node, List<Integer> list) {
        if (node != null) {
            inOrderTraversal(node.left, list);
            list.add(node.element);
            inOrderTraversal(node.right, list);
        }
    }


}
