public class RepOkClass1{
    public boolean repOK_1() {
        if (root == null) {
            return false;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1;
    }


}
