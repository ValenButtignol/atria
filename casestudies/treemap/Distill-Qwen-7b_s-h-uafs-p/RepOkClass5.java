public class RepOkClass5{
    public boolean property_5() {
        List<K> keys = new ArrayList<>();
        getKeys(root, keys);
        return keys.size() == size;
    }

    private <K extends Comparable<? super K>> void getKeys(Node node, List<K> keys) {
        if (node == null) {
            return;
        }
        keys.add(node.key);
        getKeys(node.left, keys);
        getKeys(node.right, keys);
    }


}
