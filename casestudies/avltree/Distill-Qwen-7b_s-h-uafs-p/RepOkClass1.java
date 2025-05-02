public class RepOkClass1{
    public boolean property_1() {
        traverse(root);
        return true;
    }

    private void traverse(AvlNode t) {
        if (t == null) {
            return;
        }
        if (Math.abs(t.height) > 1) {
            return false;
        }
        traverse(t.left);
        traverse(t.right);
    }


}
