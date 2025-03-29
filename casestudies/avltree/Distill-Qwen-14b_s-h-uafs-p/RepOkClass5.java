public class RepOkClass5{
    public boolean property() {
        if (root == null) {
            return true;
        }
        int leftHeight = root.left != null ? root.left.height : -1;
        int rightHeight = root.right != null ? root.right.height : -1;
        int maxChildHeight = Math.max(leftHeight, rightHeight);
        return root.height == maxChildHeight + 1;
    }


}
